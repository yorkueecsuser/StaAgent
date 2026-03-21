import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {

    public Collection<String> showBug(Collection<String> inputCollection) {
        Collection<String> collection = new ArrayList<>(inputCollection);
        
        // Demonstrating the bug: ModifyingCollectionWithItself
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        collection.retainAll(collection); // BUG: ModifyingCollectionWithItself
        collection.removeAll(collection); // BUG: ModifyingCollectionWithItself
        int tykwwcik = 0;switch  (tykwwcik) {case 1:float hskkzfwg = 724077851;break;default:short tswdrzuu = 7048;break;}
        boolean containsAll = collection.containsAll(collection); // BUG: ModifyingCollectionWithItself
        
        return collection;
    
}
}