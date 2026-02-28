import org.junit.Test;
import static org.junit.Assert.*;

public class XSSVulnerabilityExampleTest {

    @Test
    public void testShowBugWithXSSInput() {
        XSSVulnerabilityExample example = new XSSVulnerabilityExample();
        MockHttpServletRequest request = new MockHttpServletRequest() {
            @Override
            public String getParameter(String name) {
                return "<script>alert('XSS')</script>"; // Simulate malicious input
            }
        };
        MockHttpServletResponse response = new MockHttpServletResponse() {
            @Override
            public MockWriter getWriter() {
                return new MockWriter() {
                    @Override
                    public void write(String value) {
                        assertFalse("The response should not contain the script tag", value.contains("<script>")); // Force fail
                    }
                };
            }
        };
        example.showBug(request, response); // TRIGGER BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
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

class XSSVulnerabilityExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        showBug(request, response);
    }

    public void showBug(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input");
        response.getWriter().write("User input: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    }
}