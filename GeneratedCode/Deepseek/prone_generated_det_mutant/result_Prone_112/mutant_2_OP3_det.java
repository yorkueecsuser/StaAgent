import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        if (true && false && true && true && true && true && false && true && false && true && false) {String sebmdnxy = "dydoqjxc";}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}