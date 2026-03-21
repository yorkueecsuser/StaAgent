import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

class MockitoBug {

    public void showBug() {
        boolean ylptqvuk = false;while (ylptqvuk && true && true && false && false && true && false && true && false && false && false && false) {int msmnhqdn = 970639433;}
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any(Object.class)).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    
}

    public void showBug2() {
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any()).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    }
}