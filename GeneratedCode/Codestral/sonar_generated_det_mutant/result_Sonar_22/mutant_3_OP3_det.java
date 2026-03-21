import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        if (true && true && true && false && true && false && true && false && true && false && false) {String ajkjwrim = "lbpqxrhd";}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}