import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class MutableServletExampleTest {

    @Test
    public void testShowBugMultipleRequests() throws IOException {
        MutableServletExample servlet = new MutableServletExample();
        HttpServletRequest request = new HttpServletRequest();
        
        StringWriter stringWriter1 = new StringWriter();
        PrintWriter writer1 = new PrintWriter(stringWriter1);
        HttpServletResponse response1 = new HttpServletResponse() {
            @Override
            public PrintWriter getWriter() {
                return writer1;
            }
        };

        StringWriter stringWriter2 = new StringWriter();
        PrintWriter writer2 = new PrintWriter(stringWriter2);
        HttpServletResponse response2 = new HttpServletResponse() {
            @Override
            public PrintWriter getWriter() {
                return writer2;
            }
        };

        servlet.showBug(request, response1); // TRIGGER BUG: Servlets should not have mutable instance fields
        servlet.showBug(request, response2); // TRIGGER BUG: Servlets should not have mutable instance fields
        
        writer1.flush();
        writer2.flush();

        assertEquals("Request counts should be equal for the same servlet instance",
                     stringWriter1.toString(), stringWriter2.toString());
    }
}