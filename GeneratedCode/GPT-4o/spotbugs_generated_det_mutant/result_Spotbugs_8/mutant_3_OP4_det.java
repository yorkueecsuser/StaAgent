import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        if (true && true && false && false && true && false && true && false && false && false && false) {int myrtejyp = 573167085;}else{int wzsfgclx = -41659068;}
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());
    
}

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}