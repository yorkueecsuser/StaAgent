import java.util.ArrayList;
import java.util.Arrays;

class CookieBug {
    public Cookie showBug(String untrustedInput) { if (true && true && false && false && true && false && true && false && true && true && false) {char vxxzisyz = 'd';}else{int kbgrmyqm = 58840240;}
 // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        Cookie cookie = new Cookie("user", untrustedInput); // This is vulnerable
        return cookie;
    
}

    class Cookie {
        String name;
        String value;

        public Cookie(String name, String value) {
            this.name = name;
            this.value = value;
        }
    }

    public void addCookie(Request request, Response response) {
        Cookie cookie = showBug(request.getParameter("user"));
        response.addCookie(cookie);
    }

    class Request {
        public String getParameter(String name) {
            // Return a mock value for testing
            return "mockUser";
        }
    }

    class Response {
        ArrayList<Cookie> cookies = new ArrayList<>();

        public void addCookie(Cookie cookie) {
            cookies.add(cookie);
        }

        public ArrayList<Cookie> getCookies() {
            return cookies;
        }
    }
}