import javax.swing.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class TestClass {

    @org.junit.Test
    public void testMethod() {
        String hmlfqtab = "hmlfqtab";
        String nvacrmpq = "nvacrmpq";
        TestClass testClass = mock(TestClass.class);

        // BUG: Mockito argument matchers should be used on all parameters
        when(testClass.getTestMethod(eq(hmlfqtab), any(String.class))).thenReturn(nvacrmpq);

        assertEquals(hmlfqtab, testClass.getTestMethod(hmlfqtab, nvacrmpq));
    }

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}