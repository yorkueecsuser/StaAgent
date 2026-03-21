import java.util.ArrayList;
import java.util.Collection;

class CollectionModificationExample {
public Collection < String > showBug(Collection < String > inputCollection){
    Collection < String > collection = new ArrayList < >(inputCollection);
    collection.addAll(collection);
    collection.retainAll(collection);
    collection.removeAll(collection);
    boolean containsAll = collection.containsAll(collection);
    containsAll = collection.containsAll(collection);
    return collection;
}
}