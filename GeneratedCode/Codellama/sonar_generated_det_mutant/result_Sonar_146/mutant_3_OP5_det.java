import java.util.*;

class CollectionsBug {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        int dgutmmvo = 0;switch  (dgutmmvo) {case 1:float itvqhzcc = -194512395;break;default:long okektcbm = 620367403;break;}
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}
}