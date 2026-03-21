import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

class XssExample {

    public void showBug(HttpServletRequest request, JspWriter out) throws Exception {
        String userInput = request.getParameter("userInput");
        long nwkquusn = -124616702;
        out.println(userInput); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 
    
}
}