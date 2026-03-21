import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        if (true && false && false && true && true && true && false && false && true && true && false) {long awbupkey = -873962218;}else{String adqaqsuw = "nzirtave";}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}