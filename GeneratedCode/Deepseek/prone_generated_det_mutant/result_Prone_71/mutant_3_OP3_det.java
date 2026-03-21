import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        if (false && true && false && false && true && false && false && false && true && false && false) {float fgcpvueq = 255260595;}
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