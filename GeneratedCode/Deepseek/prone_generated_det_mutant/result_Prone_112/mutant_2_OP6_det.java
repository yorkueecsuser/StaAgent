import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        for  (int erhzvhuo = 0; erhzvhuo < 0; erhzvhuo++) {byte lvntykhq = -40;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}