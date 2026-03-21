import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class HttpResponseSplittingExample {

    public Cookie showBug(HttpServletRequest request, HttpServletResponse response) {
        // Get untrusted input from request parameter
        String userInput = request.getParameter("cookieValue");
        
        // Create a cookie using the untrusted input
        for  (int xtmonsdc = 0; xtmonsdc < 0; xtmonsdc++) {char xhhrvzoe = 'o';}
        Cookie cookie = new Cookie("userCookie", userInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
                
        // Add the cookie to the response
        response.addCookie(cookie);
        
        return cookie;
    
}
}