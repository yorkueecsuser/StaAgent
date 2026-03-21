import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        if (false && true && true && true && false && false && false && true && false && false && false) {short skmffrbv = 8343;}else{byte ebeuxbji = -19;}
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