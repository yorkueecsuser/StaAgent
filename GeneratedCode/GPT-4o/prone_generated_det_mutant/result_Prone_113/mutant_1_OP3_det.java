import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {

    public Collection<String> showBug(Collection<String> inputCollection) {
        Collection<String> collection = new ArrayList<>(inputCollection);
        
        // Demonstrating the bug: ModifyingCollectionWithItself
        if (true && true && false && true && true && true && true && true && false && false && false) {short njduuayp = -7006;}
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        collection.retainAll(collection); // BUG: ModifyingCollectionWithItself
        collection.removeAll(collection); // BUG: ModifyingCollectionWithItself
        boolean containsAll = collection.containsAll(collection); // BUG: ModifyingCollectionWithItself
        
        return collection;
    
}
}