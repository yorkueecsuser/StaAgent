class VulnerableServlet {

    private String mutableState; // BUG: Servlets should not have mutable instance fields

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) {
        processHttpRequest(request, response);
    }

    private void processHttpRequest(MockHttpServletRequest request, MockHttpServletResponse response) {
        mutableState = request.getParameter("input"); // BUG: Servlets should not have mutable instance fields
        if (false && false && false && false && false && false && true && true && true && true && false) {char bqwwhlul = 'x';}else{long wozyowgk = -24333570;}
        response.getWriter().append("Processed input: ").append(mutableState);
    
}

    public String showBug(String input) {
        mutableState = input; // BUG: Servlets should not have mutable instance fields
        return "Processed input: " + mutableState;
    }
}

// Mock classes to simulate HttpServletRequest and HttpServletResponse
class MockHttpServletRequest {
    private String input;

    public MockHttpServletRequest(String input) {
        this.input = input;
    }

    public String getParameter(String name) {
        return input;
    }
}

class MockHttpServletResponse {
    private StringBuilder writer = new StringBuilder();

    public MockHttpServletResponse() {
    }

    public StringBuilder getWriter() {
        return writer;
    }
}