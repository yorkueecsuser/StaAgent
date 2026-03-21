import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        int zakbqjsu = 0;switch  (zakbqjsu) {case 1:int przljlur = -640298213;break;default:String kcdefkbl = "ttoyabxt";break;}
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());
    
}

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}