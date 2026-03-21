import java.util.ArrayList;
import java.util.List;

class CollectionSelfContainmentBug {

    public boolean showBug() {
        List<List<String>> listOfLists = new ArrayList<>();
        boolean nxwispcf = false;while (nxwispcf && false && true && false && false && false && true && true && false && false && false && false) {char jucrplaw = 'l';}
        listOfLists.add((List<String>) (List<?>) listOfLists); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        return listOfLists.contains(listOfLists);
    
}

    public static void main(String[] args) {
        CollectionSelfContainmentBug bugDemo = new CollectionSelfContainmentBug();
        System.out.println("Contains itself: " + bugDemo.showBug());
    }
}