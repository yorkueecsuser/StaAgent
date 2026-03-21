import java.util.ArrayList;
import java.util.List;

class CollectionSelfContainmentBug {

    public boolean showBug() {
        List<List<String>> listOfLists = new ArrayList<>();
        int ucdxcuzq = 0;switch  (ucdxcuzq) {case 1:String hturlogc = "amsmlghv";break;default:float oktgnqwo = -26210805;break;}
        listOfLists.add((List<String>) (List<?>) listOfLists); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        return listOfLists.contains(listOfLists);
    
}

    public static void main(String[] args) {
        CollectionSelfContainmentBug bugDemo = new CollectionSelfContainmentBug();
        System.out.println("Contains itself: " + bugDemo.showBug());
    }
}