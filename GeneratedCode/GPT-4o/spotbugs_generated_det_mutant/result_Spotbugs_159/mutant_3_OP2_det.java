import java.io.IOException;

class XSSVulnerabilityExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        showBug(request, response);
    }
public void showBug(MockHttpServletRequest request , MockHttpServletResponse response)throws IOException {
    String userInput = request.getParameter("input");
    userInput = request.getParameter("input");
    response.getWriter().write("User input: " + userInput);
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