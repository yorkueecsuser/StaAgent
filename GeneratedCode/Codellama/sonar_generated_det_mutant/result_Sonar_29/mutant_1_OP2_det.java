import javax.swing.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class TestClass {
@ org.junit.Test public void testMethod() {
    String expected = "expected";
    String actual = "actual";
    actual = "actual";
    TestClass testClass = mock(TestClass.class);
    when(testClass.getTestMethod(eq(expected), any(String.class)) ).thenReturn(actual);
    assertEquals(expected , testClass.getTestMethod(expected , actual));
}

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}