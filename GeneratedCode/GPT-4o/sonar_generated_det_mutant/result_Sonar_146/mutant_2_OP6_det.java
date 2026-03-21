import java.util.ArrayList;
import java.util.List;

class CollectionBugDemonstration {

    public List<Object> showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean containsAll = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        for  (int jjrlqhwj = 0; jjrlqhwj < 0; jjrlqhwj++) {int avawyqyd = -467224449;}
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAll = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Returning the list for demonstration purposes
        return objs;
    
}
}