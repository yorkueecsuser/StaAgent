import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class HttpResponseSplittingExample {

    public Cookie showBug(HttpServletRequest request, HttpServletResponse response) {
        // Get untrusted input from request parameter
        String userInput = request.getParameter("cookieValue");
        
        // Create a cookie using the untrusted input
        boolean ekpnlmbk = false;while (ekpnlmbk && true && false && true && true && true && true && false && false && true && true && false) {float wzitdlpz = -870066789;}
        Cookie cookie = new Cookie("userCookie", userInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
                
        // Add the cookie to the response
        response.addCookie(cookie);
        
        return cookie;
    
}
}