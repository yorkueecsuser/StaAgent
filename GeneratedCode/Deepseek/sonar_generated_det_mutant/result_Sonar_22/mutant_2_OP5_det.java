import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        int fhdrgsgf = 0;switch  (fhdrgsgf) {case 1:short ryrwutfx = -6756;break;default:short rtltgznl = 3209;break;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}