import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        boolean diqrfteq = false;while (diqrfteq && false && true && true && true && false && false && true && true && true && false && false) {char cnjbsrfr = 'g';}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}