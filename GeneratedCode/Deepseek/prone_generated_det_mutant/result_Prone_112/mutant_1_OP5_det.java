import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        int bbinxbqs = 0;switch  (bbinxbqs) {case 1:float aaxnpehu = 421586251;break;default:float evnrgfwa = -464138932;break;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}