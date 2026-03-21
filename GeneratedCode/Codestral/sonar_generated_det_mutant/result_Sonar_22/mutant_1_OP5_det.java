import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        int brhdmcwb = 0;switch  (brhdmcwb) {case 1:int kfqgargk = 667603589;break;default:short imljtgfo = -232;break;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}