import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        for  (int zjjamalq = 0; zjjamalq < 0; zjjamalq++) {byte nfvpckms = 47;}
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