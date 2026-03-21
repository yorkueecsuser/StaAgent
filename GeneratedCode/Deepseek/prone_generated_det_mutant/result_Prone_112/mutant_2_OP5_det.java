import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        int iavnivyb = 0;switch  (iavnivyb) {case 1:short qivgeiss = 9036;break;default:char ncjgsrjd = 's';break;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}