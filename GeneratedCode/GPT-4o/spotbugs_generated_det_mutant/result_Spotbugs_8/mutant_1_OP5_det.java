import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        int ssmfvssg = 0;switch  (ssmfvssg) {case 1:String xtkavceo = "dgukokdi";break;default:short pgwvicqz = 8650;break;}
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());
    
}

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}