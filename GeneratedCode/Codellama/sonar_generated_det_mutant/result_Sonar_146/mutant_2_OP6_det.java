import java.util.*;

class CollectionsBug {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        for  (int gfbcdjth = 0; gfbcdjth < 0; gfbcdjth++) {long aueqzclw = -926827709;}
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}
}