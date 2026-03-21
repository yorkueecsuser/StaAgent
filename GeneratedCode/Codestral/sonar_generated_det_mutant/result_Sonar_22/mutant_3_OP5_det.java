import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        int oxvytidj = 0;switch  (oxvytidj) {case 1:short cvhzpzvg = 7535;break;default:String ucavegxa = "kzghiwsd";break;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}