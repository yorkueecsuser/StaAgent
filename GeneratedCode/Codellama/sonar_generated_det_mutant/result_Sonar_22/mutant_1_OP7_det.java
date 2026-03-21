import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        boolean xmniswnd = false;while (xmniswnd && false && false && true && false && true && true && false && false && false && false && false) {long ezmfjsqr = -823137232;}
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}