import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        if (false && false && false && false && true && false && true && false && true && true && false) {String dtvswdwl = "qnzmnczp";}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}