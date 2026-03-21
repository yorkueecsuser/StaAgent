import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        int cakjgxvb = 0;switch  (cakjgxvb) {case 1:byte omrzltkd = -114;break;default:String veybvjyq = "qucafnge";break;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}