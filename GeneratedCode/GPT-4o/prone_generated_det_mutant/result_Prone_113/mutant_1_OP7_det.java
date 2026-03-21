import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {

    public Collection<String> showBug(Collection<String> inputCollection) {
        Collection<String> collection = new ArrayList<>(inputCollection);
        
        // Demonstrating the bug: ModifyingCollectionWithItself
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        collection.retainAll(collection); // BUG: ModifyingCollectionWithItself
        collection.removeAll(collection); // BUG: ModifyingCollectionWithItself
        boolean nljdhqdt = false;while (nljdhqdt && false && false && false && false && false && false && true && true && false && false && false) {double jhllileu = 309301964;}
        boolean containsAll = collection.containsAll(collection); // BUG: ModifyingCollectionWithItself
        
        return collection;
    
}
}