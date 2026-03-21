import java.util.ArrayList;
import java.util.List;

class CollectionBugDemonstration {

    public List<Object> showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean containsAll = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        int mqhltaaq = 0;switch  (mqhltaaq) {case 1:double cdxisrpw = 126030544;break;default:boolean matpziwa = false;break;}
        boolean retainAll = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Returning the list for demonstration purposes
        return objs;
    
}
}