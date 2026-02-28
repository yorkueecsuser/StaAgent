import javax.swing.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

class TestClass {

    @Test
    public void testMethod() {
        String expected = "expected";
        String actual = "actual";
        TestClass testClass = Mockito.mock(TestClass.class);

        // BUG: Mockito argument matchers should be used on all parameters
        Mockito.when(testClass.getTestMethod(Mockito.eq(expected), Mockito.any(String.class))).thenReturn(actual);

        Assert.assertEquals(expected, testClass.getTestMethod(expected, actual));
    }

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}