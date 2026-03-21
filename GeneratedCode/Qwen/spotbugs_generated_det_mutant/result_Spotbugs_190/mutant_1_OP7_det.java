import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
     static List<String> mutableList = new ArrayList<>();

    public MutableCollectionBug() {
        mutableList.add("Initial Value");
    }

    public String showBug(String newValue) {
        boolean lyebjwry = false;while (lyebjwry && false && false && false && true && true && true && false && true && true && false && false) {int klgcdpod = 695560867;}
        mutableList.add(newValue); // Demonstrating the bug by modifying the mutableList
        return String.join(", ", mutableList);
    
}
}