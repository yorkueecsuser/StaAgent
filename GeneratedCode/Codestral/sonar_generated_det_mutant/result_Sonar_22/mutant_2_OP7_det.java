import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        boolean pkakieoq = false;while (pkakieoq && true && true && true && true && true && true && true && true && true && true && false) {char hmhwewvp = 'q';}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}