import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        for  (int fdjqgzlo = 0; fdjqgzlo < 0; fdjqgzlo++) {byte wlzedkjt = -116;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}