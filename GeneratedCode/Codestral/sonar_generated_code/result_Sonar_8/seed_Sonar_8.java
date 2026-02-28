class HttpServletResponse {
    public static final int SC_OK = 200;
    public static final int SC_INTERNAL_SERVER_ERROR = 500;

    public void setStatus(int sc) {}
}

class HttpServletRequest {}

class BuggyController {

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            // Actions taken if no exception is thrown
            response.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            // No appropriate status code is set on exception
            // BUG: Set appropriate Status Codes on HTTP responses
        }
    }

    public void showBug(HttpServletRequest request, HttpServletResponse response) {
        handleRequest(request, response);
    }
}