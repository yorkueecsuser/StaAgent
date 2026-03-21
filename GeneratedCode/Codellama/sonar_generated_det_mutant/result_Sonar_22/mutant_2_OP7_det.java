import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        boolean pclzurov = false;while (pclzurov && true && true && false && true && true && false && false && false && false && true && false) {byte gddfuohs = -96;}
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}