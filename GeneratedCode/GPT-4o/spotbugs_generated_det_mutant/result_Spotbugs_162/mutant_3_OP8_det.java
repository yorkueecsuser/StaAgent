import java.io.IOException;

class HttpResponseSplittingExample {

    public void showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String hfsjvpvl = request.getParameter("userInput"); // This is untrusted input from the user
        addCookie(response, hfsjvpvl);
    }

    private void addCookie(HttpServletResponse response, String untrustedValue) {
        Cookie cookie = new Cookie("session", untrustedValue); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
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