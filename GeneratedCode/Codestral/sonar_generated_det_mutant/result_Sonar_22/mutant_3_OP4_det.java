import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        if (false && false && false && true && false && true && false && true && false && false && false) {boolean ugmituwp = false;}else{float dsoeklbr = 235171867;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}