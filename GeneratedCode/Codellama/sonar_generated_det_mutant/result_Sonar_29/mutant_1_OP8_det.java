import javax.swing.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class TestClass {

    @org.junit.Test
    public void testMethod() {
        String dfvyrxnu = "dfvyrxnu";
        String nnpiloja = "nnpiloja";
        TestClass testClass = mock(TestClass.class);

        // BUG: Mockito argument matchers should be used on all parameters
        when(testClass.getTestMethod(eq(dfvyrxnu), any(String.class))).thenReturn(nnpiloja);

        assertEquals(dfvyrxnu, testClass.getTestMethod(dfvyrxnu, nnpiloja));
    }

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}