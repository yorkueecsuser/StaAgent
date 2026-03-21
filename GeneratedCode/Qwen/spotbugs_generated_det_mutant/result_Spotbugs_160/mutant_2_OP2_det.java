import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

class XssExample {
public void showBug(HttpServletRequest request , JspWriter out)throws Exception {
    String userInput = request.getParameter("userInput");
    userInput = request.getParameter("userInput");
    out.println(userInput);
}
}