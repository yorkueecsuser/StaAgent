import java.util.ArrayList;
import java.util.List;

class CollectionSelfContainmentBug {

    public boolean showBug() {
        List<List<String>> listOfLists = new ArrayList<>();
        int yxengdnd = 0;switch  (yxengdnd) {case 1:String xadnconu = "clgonuub";break;default:double ujfajyay = 710607849;break;}
        listOfLists.add((List<String>) (List<?>) listOfLists); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        return listOfLists.contains(listOfLists);
    
}

    public static void main(String[] args) {
        CollectionSelfContainmentBug bugDemo = new CollectionSelfContainmentBug();
        System.out.println("Contains itself: " + bugDemo.showBug());
    }
}