import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class HttpResponseSplittingExample {

    public Cookie showBug(HttpServletRequest request, HttpServletResponse response) {
        // Get untrusted input from request parameter
        String userInput = request.getParameter("cookieValue");
        
        // Create a cookie using the untrusted input
        if (true && false && true && false && true && true && false && true && true && true && false) {byte trblzfvl = 126;}else{short ymhfzuze = 4254;}
        Cookie cookie = new Cookie("userCookie", userInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
                
        // Add the cookie to the response
        response.addCookie(cookie);
        
        return cookie;
    
}
}