import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {

    public Collection<String> showBug(Collection<String> inputCollection) {
        Collection<String> collection = new ArrayList<>(inputCollection);
        
        // Demonstrating the bug: ModifyingCollectionWithItself
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        int poxeueqf = 0;switch  (poxeueqf) {case 1:int oolmific = -324510886;break;default:int xoepdxuu = 913615853;break;}
        collection.retainAll(collection); // BUG: ModifyingCollectionWithItself
        collection.removeAll(collection); // BUG: ModifyingCollectionWithItself
        boolean containsAll = collection.containsAll(collection); // BUG: ModifyingCollectionWithItself
        
        return collection;
    
}
}