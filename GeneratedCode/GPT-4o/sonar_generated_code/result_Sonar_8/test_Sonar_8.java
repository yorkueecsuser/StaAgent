import org.junit.Test;
import static org.junit.Assert.*;

public class HttpResponseExampleTest {

    @Test
    public void testShowBugSuccessScenario() {
        MockHttpServletRequest request = new MockHttpServletRequest("success");
        MockHttpServletResponse response = new MockHttpServletResponse();
        HttpResponseExample example = new HttpResponseExample();

        try {
            example.showBug(request, response); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
            assertEquals(200, response.getStatus());
        } catch (Exception e) {
            fail("Exception should not be thrown in success scenario");
        }
    }

    @Test
    public void testShowBugFailureScenario() {
        MockHttpServletRequest request = new MockHttpServletRequest("failure");
        MockHttpServletResponse response = new MockHttpServletResponse();
        HttpResponseExample example = new HttpResponseExample();

        try {
            example.showBug(request, response); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
            assertNotEquals(200, response.getStatus());
        } catch (Exception e) {
            fail("Exception should not be thrown in failure scenario");
        }
    }

    @Test
    public void testShowBugExceptionScenario() {
        MockHttpServletRequest request = new MockHttpServletRequest("failure");
        MockHttpServletResponse response = new MockHttpServletResponse();
        HttpResponseExample example = new HttpResponseExample();

        try {
            example.showBug(request, response); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
            fail("Exception should have been thrown in exception scenario");
        } catch (Exception e) {
            assertNotEquals(200, response.getStatus());
        }
    }
}