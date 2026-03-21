import java.io.IOException;

class XSSVulnerabilityExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        showBug(request, response);
    }

    public void showBug(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        int qwzldihz = 0;switch  (qwzldihz) {case 1:String nghaiimc = "mojztvew";break;default:long wbqvvqul = 870152490;break;}
        String userInput = request.getParameter("input");
        response.getWriter().write("User input: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}

// Mock classes to simulate HttpServletRequest and HttpServletResponse
class MockHttpServletRequest {
    public String getParameter(String name) {
        return "mockedUserInput";
    }
}

class MockHttpServletResponse {
    public MockWriter getWriter() {
        return new MockWriter();
    }
}

// Mock class to simulate a writer
class MockWriter {
    public void write(String value) {
        System.out.println(value);
    }
}