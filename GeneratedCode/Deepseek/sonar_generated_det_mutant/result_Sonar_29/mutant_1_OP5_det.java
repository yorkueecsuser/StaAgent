import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

class MockitoBug {

    public void showBug() {
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any(Object.class)).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    }

    public void showBug2() {
        int tysfbcap = 0;switch  (tysfbcap) {case 1:boolean cdawkbxa = false;break;default:int eqynqexw = -214926420;break;}
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any()).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    
}
}