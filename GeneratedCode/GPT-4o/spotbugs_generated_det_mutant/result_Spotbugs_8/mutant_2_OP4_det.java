import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        if (true && false && true && false && true && false && false && true && true && false && false) {double odvooeee = 250743903;}else{int rlrckzhl = -448323971;}
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());
    
}

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}