import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        if (false && false && true && false && true && true && true && false && false && false && false) {int casnohnc = -729216925;}
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}