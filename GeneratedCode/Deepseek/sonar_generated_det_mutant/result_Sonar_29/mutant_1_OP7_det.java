import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

class MockitoBug {

    public void showBug() {
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any(Object.class)).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    }

    public void showBug2() {
        boolean hdglatob = false;while (hdglatob && true && true && true && false && false && false && true && false && true && true && false) {byte qxjsvwgl = -122;}
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any()).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    
}
}