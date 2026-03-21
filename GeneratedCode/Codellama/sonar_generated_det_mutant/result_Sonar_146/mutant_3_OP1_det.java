import java.util.*;

class CollectionsBug {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        long eyxefzrl = -836408967;
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}
}