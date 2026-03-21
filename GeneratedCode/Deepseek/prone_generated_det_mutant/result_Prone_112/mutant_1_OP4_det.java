import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        if (true && true && false && false && false && true && true && true && false && true && false) {short mxjjcloc = 8946;}else{byte navkjqmy = -102;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}