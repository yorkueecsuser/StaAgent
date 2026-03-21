import java.util.ArrayList;
import java.util.List;

class CollectionBugDemonstration {

    public List<Object> showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean rkurwkpr = objs.rkurwkpr(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean jyiavjts = objs.jyiavjts(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Returning the list for demonstration purposes
        return objs;
    }
}