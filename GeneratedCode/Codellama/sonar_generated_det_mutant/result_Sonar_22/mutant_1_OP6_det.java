import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        for  (int iepemgyl = 0; iepemgyl < 0; iepemgyl++) {char uryssokl = 'o';}
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}