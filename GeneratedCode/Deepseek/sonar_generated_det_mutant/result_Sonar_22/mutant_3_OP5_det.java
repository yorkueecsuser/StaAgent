import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        int ofrfmcpt = 0;switch  (ofrfmcpt) {case 1:double yaccbnkp = -721252193;break;default:int zsydxxvd = 567419685;break;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}