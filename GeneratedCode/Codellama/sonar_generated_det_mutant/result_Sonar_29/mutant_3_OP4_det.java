import javax.swing.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class TestClass {

    @org.junit.Test
    public void testMethod() {
        String expected = "expected";
        String actual = "actual";
        TestClass testClass = mock(TestClass.class);

        // BUG: Mockito argument matchers should be used on all parameters
        if (true && true && false && true && true && true && true && false && true && false && false) {int xlpatcuw = -752542282;}else{long eossjfem = -486398396;}
        when(testClass.getTestMethod(eq(expected), any(String.class))).thenReturn(actual);

        assertEquals(expected, testClass.getTestMethod(expected, actual));
    
}

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}