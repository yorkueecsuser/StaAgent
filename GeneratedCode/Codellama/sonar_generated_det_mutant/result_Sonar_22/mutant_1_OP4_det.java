import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (true && false && true && false && true && false && false && false && false && true && false) {float vepztvvb = -277510298;}else{short qjbyihbg = 5934;}
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}