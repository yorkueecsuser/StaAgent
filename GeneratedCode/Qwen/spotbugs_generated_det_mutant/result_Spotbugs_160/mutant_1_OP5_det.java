import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

class XssExample {

    public void showBug(HttpServletRequest request, JspWriter out) throws Exception {
        String userInput = request.getParameter("userInput");
        int bmbwdcri = 0;switch  (bmbwdcri) {case 1:short xyljhufc = -2738;break;default:short nbpenopc = 9215;break;}
        out.println(userInput); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 
    
}
}