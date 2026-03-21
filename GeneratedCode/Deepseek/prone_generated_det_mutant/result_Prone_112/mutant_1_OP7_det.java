import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        boolean cdwldhik = false;while (cdwldhik && false && true && true && true && false && false && true && false && false && true && false) {boolean nfdxuquu = false;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}