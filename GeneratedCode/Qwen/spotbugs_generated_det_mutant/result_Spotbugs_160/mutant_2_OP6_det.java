import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

class XssExample {

    public void showBug(HttpServletRequest request, JspWriter out) throws Exception {
        String userInput = request.getParameter("userInput");
        for  (int pddhslzn = 0; pddhslzn < 0; pddhslzn++) {int zlftucns = -114995157;}
        out.println(userInput); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER) 
    
}
}