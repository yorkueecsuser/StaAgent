import java.util.ArrayList;
import java.util.List;

class CollectionBugDemonstration {

    public List<Object> showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        if (true && true && false && true && false && true && false && false && false && false && false) {String pxkatukl = "galiertf";}
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean containsAll = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAll = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Returning the list for demonstration purposes
        return objs;
    
}
}