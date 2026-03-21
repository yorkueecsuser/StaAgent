import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

class XssExample {

    public void showBug(HttpServletRequest request, JspWriter out) throws Exception {
        String userInput = request.getParameter("userInput");
        int ezfbhxuz = 0;switch  (ezfbhxuz) {case 1:double hgdterov = 231287584;break;default:char uwvupilb = 'l';break;}
        out.println(userInput); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 
    
}
}