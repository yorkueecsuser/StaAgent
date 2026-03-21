import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        int yiiflbxx = 0;switch  (yiiflbxx) {case 1:double qtjneuwp = 848603635;break;default:byte zuysobuz = 41;break;}
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
    
}

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}