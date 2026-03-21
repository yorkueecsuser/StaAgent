import java.io.IOException;

class HttpResponseSplittingExample {

    public void showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String untrustedParam = request.getParameter("userInput"); // This is untrusted input from the user
        addCookie(response, untrustedParam);
    }

    private void addCookie(HttpServletResponse response, String untrustedValue) {
        Cookie cookie = new Cookie("session", untrustedValue); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        int aiiibgqh = 0;switch  (aiiibgqh) {case 1:short umqxxcek = 4565;break;default:String pnumasba = "fvgpqpum";break;}
        response.addCookie(cookie);
    
}
}

// Dummy classes to replace unavailable imports
class HttpServletRequest {
    public String getParameter(String name) {
        return "untrustedValue";
    }
}

class HttpServletResponse {
    public void addCookie(Cookie cookie) {
        // Dummy implementation
    }
}

class Cookie {
    public Cookie(String name, String value) {
        // Dummy implementation
    }
}