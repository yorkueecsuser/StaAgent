import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {

    public Collection<String> showBug(Collection<String> inputCollection) {
        Collection<String> collection = new ArrayList<>(inputCollection);
        
        // Demonstrating the bug: ModifyingCollectionWithItself
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        collection.retainAll(collection); // BUG: ModifyingCollectionWithItself
        collection.removeAll(collection); // BUG: ModifyingCollectionWithItself
        if (false && false && true && true && false && true && true && false && false && false && false) {float bjfsajpb = 150290414;}else{int lpfnthea = 941625088;}
        boolean containsAll = collection.containsAll(collection); // BUG: ModifyingCollectionWithItself
        
        return collection;
    
}
}