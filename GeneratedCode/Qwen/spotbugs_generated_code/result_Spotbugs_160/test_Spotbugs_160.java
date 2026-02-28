import org.junit.Test;
import static org.junit.Assert.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import java.io.CharArrayWriter;
import java.io.IOException;

class XssExample {

    public void showBug(HttpServletRequest request, JspWriter out) throws Exception {
        String userInput = request.getParameter("userInput");
        out.println(userInput); // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 
    }
}

public class XssExampleTest {

    @Test
    public void testShowBugTriggersXss() throws Exception {
        HttpServletRequest mockRequest = new MockHttpServletRequest("userInput", "<script>alert('xss');</script>");
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        JspWriter mockJspWriter = new MockJspWriter(charArrayWriter);

        XssExample xssExample = new XssExample();
        xssExample.showBug(mockRequest, mockJspWriter); // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 

        String result = charArrayWriter.toString();
        assertTrue(result.contains("<script>alert('xss');</script>"));
    }

    private static class MockHttpServletRequest implements HttpServletRequest {
        private final String parameterName;
        private final String parameterValue;

        public MockHttpServletRequest(String parameterName, String parameterValue) {
            this.parameterName = parameterName;
            this.parameterValue = parameterValue;
        }

        @Override
        public String getParameter(String name) {
            return parameterName.equals(name)? parameterValue : null;
        }

        // Other methods can be implemented if necessary, but they are not needed for this test
    }

    private static class MockJspWriter extends JspWriter {
        private final CharArrayWriter charArrayWriter;

        public MockJspWriter(CharArrayWriter charArrayWriter) {
            super(1024, true);
            this.charArrayWriter = charArrayWriter;
        }

        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            charArrayWriter.write(cbuf, off, len);
        }

        @Override
        public void write(String str, int off, int len) throws IOException {
            charArrayWriter.write(str, off, len);
        }

        @Override
        public void write(int c) throws IOException {
            charArrayWriter.write(c);
        }

        @Override
        public void print(boolean b) throws IOException {
            charArrayWriter.write(Boolean.toString(b));
        }

        @Override
        public void print(char c) throws IOException {
            charArrayWriter.write(c);
        }

        @Override
        public void print(int i) throws IOException {
            charArrayWriter.write(Integer.toString(i));
        }

        @Override
        public void print(long l) throws IOException {
            charArrayWriter.write(Long.toString(l));
        }

        @Override
        public void print(float f) throws IOException {
            charArrayWriter.write(Float.toString(f));
        }

        @Override
        public void print(double d) throws IOException {
            charArrayWriter.write(Double.toString(d));
        }

        @Override
        public void print(char[] s) throws IOException {
            charArrayWriter.write(s);
        }

        @Override
        public void print(String s) throws IOException {
            charArrayWriter.write(s);
        }

        @Override
        public void print(Object obj) throws IOException {
            charArrayWriter.write(obj.toString());
        }

        @Override
        public void println() throws IOException {
            charArrayWriter.write(System.lineSeparator());
        }

        @Override
        public void println(boolean x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(char x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(int x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(long x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(float x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(double x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(char[] x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(String x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void println(Object x) throws IOException {
            print(x);
            println();
        }

        @Override
        public void clear() throws IOException {
            charArrayWriter.reset();
        }

        @Override
        public void clearBuffer() throws IOException {
            clear();
        }

        @Override
        public void flush() throws IOException {
            charArrayWriter.flush();
        }

        @Override
        public void close() throws IOException {
            charArrayWriter.close();
        }

        @Override
        public int getRemaining() {
            return charArrayWriter.size();
        }
    }
}