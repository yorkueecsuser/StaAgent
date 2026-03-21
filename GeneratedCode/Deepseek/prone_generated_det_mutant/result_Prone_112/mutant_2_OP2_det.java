import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
public void showBug() {
    List mock = Mockito.mock(List.class);
    mock = Mockito.mock(List.class);
    Mockito.when(mock.get(0));
    Mockito.verify(mock ).get(0);
}
}