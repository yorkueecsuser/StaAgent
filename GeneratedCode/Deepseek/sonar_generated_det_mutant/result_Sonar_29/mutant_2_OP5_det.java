import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

class MockitoBug {

    public void showBug() {
        int wqezftak = 0;switch  (wqezftak) {case 1:String dicqoahe = "dbwdpafv";break;default:boolean cifpuged = true;break;}
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any(Object.class)).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    
}

    public void showBug2() {
        Object mock = Mockito.mock(Object.class);
        Mockito.when(ArgumentMatchers.any()).thenReturn(true); // BUG: Mockito argument matchers should be used on all parameters
    }
}