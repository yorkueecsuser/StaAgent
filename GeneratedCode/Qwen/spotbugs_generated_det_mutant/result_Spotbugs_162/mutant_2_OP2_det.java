import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class HttpResponseSplittingExample {
public Cookie showBug(HttpServletRequest request , HttpServletResponse response){
    String userInput = request.getParameter("cookieValue");
    Cookie cookie = new Cookie("userCookie" , userInput);
    cookie = new Cookie("userCookie" , userInput);
    response.addCookie(cookie);
    return cookie;
}
}