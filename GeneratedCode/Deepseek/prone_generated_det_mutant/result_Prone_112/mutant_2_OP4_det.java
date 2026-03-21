import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        if (false && true && false && false && true && false && false && true && true && false && false) {double dyekwyqq = 393974902;}else{long fgbxpuon = -657926266;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}