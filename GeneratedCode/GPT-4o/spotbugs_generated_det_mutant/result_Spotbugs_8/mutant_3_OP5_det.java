import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        int gnfvyodw = 0;switch  (gnfvyodw) {case 1:String qhphykem = "emfruarg";break;default:boolean ydivxmdx = true;break;}
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());
    
}

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}