import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        boolean jpupfzcf = false;while (jpupfzcf && false && true && false && true && true && false && true && true && true && false && false) {byte netaeahr = -113;}
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