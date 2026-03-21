import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        boolean owodxrsy = false;while (owodxrsy && true && true && false && false && true && true && false && false && false && false && false) {int fhxlmjln = -118862473;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}