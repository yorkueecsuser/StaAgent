import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

class XssExample {

    public void showBug(HttpServletRequest request, JspWriter out) throws Exception {
        String oxakhcbp = request.getParameter("oxakhcbp");
        out.println(oxakhcbp); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 
    }
}