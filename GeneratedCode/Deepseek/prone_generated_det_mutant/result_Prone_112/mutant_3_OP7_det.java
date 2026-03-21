import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        boolean ligiwqsl = false;while (ligiwqsl && true && true && false && true && true && false && true && true && true && true && false) {char asgbtppx = 'k';}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}