import java.util.*;

class CollectionsBug {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        int fzjaecku = 0;switch  (fzjaecku) {case 1:long urrwiiwq = 641721568;break;default:byte egitgpje = 111;break;}
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}
}