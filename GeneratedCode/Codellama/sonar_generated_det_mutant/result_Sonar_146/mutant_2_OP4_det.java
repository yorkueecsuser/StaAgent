import java.util.*;

class CollectionsBug {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        if (true && false && true && false && true && true && true && false && true && true && false) {int ayattlao = -719760426;}else{char jmivrnba = 'v';}
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}
}