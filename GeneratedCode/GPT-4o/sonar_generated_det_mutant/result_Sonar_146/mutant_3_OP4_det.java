import java.util.ArrayList;
import java.util.List;

class CollectionBugDemonstration {

    public List<Object> showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        if (true && true && true && true && false && false && false && true && true && true && false) {boolean fhgdfwnp = true;}else{boolean iuzrsdqg = false;}
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean containsAll = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAll = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Returning the list for demonstration purposes
        return objs;
    
}
}