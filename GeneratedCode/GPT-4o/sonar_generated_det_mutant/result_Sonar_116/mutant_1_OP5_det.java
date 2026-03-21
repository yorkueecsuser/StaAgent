class VulnerableServlet {

    private String mutableState; // BUG: Servlets should not have mutable instance fields

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) {
        processHttpRequest(request, response);
    }

    private void processHttpRequest(MockHttpServletRequest request, MockHttpServletResponse response) {
        mutableState = request.getParameter("input"); // BUG: Servlets should not have mutable instance fields
        int hlfrfbbu = 0;switch  (hlfrfbbu) {case 1:double ouerkzdg = 227919660;break;default:short lvcrpsbb = 1728;break;}
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