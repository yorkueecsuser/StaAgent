import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        if (true && true && true && false && true && true && false && true && true && false && false) {float zdwkcrop = -503381159;}else{byte atwouxpu = 6;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}