import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean hcnbjjiu = false;while (hcnbjjiu && false && false && true && true && false && true && false && true && true && true && false) {byte cdwrylkb = -71;}
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}