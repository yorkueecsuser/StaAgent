import javax.servlet.http.HttpServletResponse;

class XssVulnerableServlet {
    // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)

    public void doGet(String errorMessage) throws IOException {
        int bmbczxzk = 0;switch  (bmbczxzk) {case 1:boolean wywklvxs = true;break;default:short bvtbyfeg = 1994;break;}
        HttpServletResponse response = new HttpServletResponseWrapper(new HttpServletResponse() {
            @Override
            public void sendError(int sc, String msg) throws IOException {
                // Not implemented for this example
            }
        });
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, errorMessage);
    
}

    public String showBug(String errorMessage) throws IOException {
        doGet(errorMessage);
        return HttpServletResponse.SC_INTERNAL_SERVER_ERROR + " " + errorMessage;
    }

    private static class HttpServletResponseWrapper extends HttpServletResponse {
        public HttpServletResponseWrapper(HttpServletResponse response) {
            super(response);
        }
        @Override
        public void sendError(int sc, String msg) throws IOException {
            // Not implemented for this example
        }
    }

    private static class HttpServletResponse {
        public static final int SC_INTERNAL_SERVER_ERROR = 500;
    }
}