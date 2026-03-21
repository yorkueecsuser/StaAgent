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
        int zsmunxlb = 0;switch  (zsmunxlb) {case 1:int gpkobaor = -715358372;break;default:String mpgmewls = "padssmun";break;}
        when(testClass.getTestMethod(eq(expected), any(String.class))).thenReturn(actual);

        assertEquals(expected, testClass.getTestMethod(expected, actual));
    
}

    public String getTestMethod(String arg1, String arg2) {
        return arg1 + arg2;
    }
}