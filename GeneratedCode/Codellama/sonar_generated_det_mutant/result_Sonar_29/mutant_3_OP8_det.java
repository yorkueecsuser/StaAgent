import javax.swing.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class TestClass {

    @org.junit.Test
    public void testMethod() {
        String gknuzcgs = "gknuzcgs";
        String lkblumcs = "lkblumcs";
        TestClass testClass = mock(TestClass.class);

        // BUG: Mockito argument matchers should be used on all parameters
        when(testClass.getTestMethod(eq(gknuzcgs), any(String.class))).thenReturn(lkblumcs);

        assertEquals(gknuzcgs, testClass.getTestMethod(gknuzcgs, lkblumcs));
    }

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}