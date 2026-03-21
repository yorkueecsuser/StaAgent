import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        for  (int iwdrmyyg = 0; iwdrmyyg < 0; iwdrmyyg++) {long dsoyyqrd = 748202373;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}