import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (true && false && false && true && true && false && false && false && false && false && false) {long ujoqrtjc = -581659403;}else{String zowquhak = "qgkqsvmb";}
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}