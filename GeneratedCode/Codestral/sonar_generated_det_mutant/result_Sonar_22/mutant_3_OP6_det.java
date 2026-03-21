import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        for  (int ksfmdgti = 0; ksfmdgti < 0; ksfmdgti++) {double avudgfci = -799717532;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}