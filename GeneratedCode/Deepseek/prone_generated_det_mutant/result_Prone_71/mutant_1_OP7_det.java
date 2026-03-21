import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        boolean wytuorkw = false;while (wytuorkw && false && false && false && true && false && true && true && false && true && false && false) {long zrceqelb = 655449066;}
        TreeSet<IncomparableClass> set = new TreeSet<>(); // BUG: Incomparable
        set.add(new IncomparableClass());
        ArrayList<String> result = new ArrayList<>();
        for (IncomparableClass ic : set) {
            result.add(ic.toString());
        }
        return result;
    
}

    static class IncomparableClass {
        // this class doesn't implement Comparable
    }
}