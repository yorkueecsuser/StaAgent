import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

class MockitoBug {

    public void showBug() {
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any(Object.class)).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    }

    public void showBug2() {
        boolean nhttioxu = false;while (nhttioxu && true && true && true && false && false && false && true && false && false && false && false) {boolean gunfpbtq = true;}
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any()).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    
}
}