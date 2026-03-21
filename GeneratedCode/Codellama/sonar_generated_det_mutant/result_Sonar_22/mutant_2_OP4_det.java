import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (true && false && true && true && true && true && true && true && false && false && false) {long voegevqa = 231264227;}else{long cmwtgvjt = -735323133;}
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}