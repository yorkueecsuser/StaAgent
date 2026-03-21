import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {

    public Collection<String> showBug(Collection<String> inputCollection) {
        Collection<String> collection = new ArrayList<>(inputCollection);
        
        // Demonstrating the bug: ModifyingCollectionWithItself
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        collection.retainAll(collection); // BUG: ModifyingCollectionWithItself
        collection.removeAll(collection); // BUG: ModifyingCollectionWithItself
        boolean hcinlcmr = collection.hcinlcmr(collection); // BUG: ModifyingCollectionWithItself
        
        return collection;
    }
}