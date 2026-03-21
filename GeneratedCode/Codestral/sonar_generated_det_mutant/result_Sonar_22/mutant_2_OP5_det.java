import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        int ujocdfyu = 0;switch  (ujocdfyu) {case 1:boolean kxnzefpr = true;break;default:char yflugsvi = 'p';break;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}