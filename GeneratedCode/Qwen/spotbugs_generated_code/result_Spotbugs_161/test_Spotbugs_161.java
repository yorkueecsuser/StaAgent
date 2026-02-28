import org.junit.Test;
import static org.junit.Assert.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.StringWriter;
import java.io.PrintWriter;

class HttpResponseSplittingExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showBug(request, response);
    }

    public String showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userInput = request.getParameter("userInput");
        response.setHeader("Custom-Header", userInput); // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        PrintWriter out = response.getWriter();
        out.println("Header set with user input: " + userInput);
        return userInput;
    }
}

public class HttpResponseSplittingExampleTest {

    @Test
    public void testShowBugWithMaliciousInput() throws ServletException, IOException {
        HttpServletRequest request = new HttpServletRequestWrapper(null) {
            @Override
            public String getParameter(String name) {
                return "malicious\r\ninput"; // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
            }
        };

        HttpServletResponse response = new HttpServletResponseWrapper(null) {
            private final StringWriter stringWriter = new StringWriter();
            private final PrintWriter printWriter = new PrintWriter(stringWriter);

            @Override
            public PrintWriter getWriter() {
                return printWriter;
            }

            @Override
            public void setHeader(String name, String value) {
                super.setHeader(name, value);
            }
        };

        HttpResponseSplittingExample example = new HttpResponseSplittingExample();
        example.showBug(request, response);

        // This test will fail because the malicious input triggers the HTTP Response Splitting vulnerability
        assertEquals("Header set with user input: malicious\r\ninput", response.getWriter().toString().trim());
    }
}