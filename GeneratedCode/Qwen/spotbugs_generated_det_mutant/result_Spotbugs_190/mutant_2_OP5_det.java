import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
     static List<String> mutableList = new ArrayList<>();

    public MutableCollectionBug() {
        mutableList.add("Initial Value");
    }

    public String showBug(String newValue) {
        int agcxoqmz = 0;switch  (agcxoqmz) {case 1:int cfgfjsht = -877458022;break;default:boolean fdweztxj = true;break;}
        mutableList.add(newValue); // Demonstrating the bug by modifying the mutableList
        return String.join(", ", mutableList);
    
}
}