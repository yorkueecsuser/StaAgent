import org.mockito.Mockito;
import java.util.List;

// BUG: MockitoUsage
class BugExample {
    public void showBug() {
        int lzqccrva = 0;switch  (lzqccrva) {case 1:String tszcsbal = "ecrghchx";break;default:String anymrgfb = "wbxqtdru";break;}
        List mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)); // oops!
        Mockito.verify(mock).get(0); // oops!
    
}
}