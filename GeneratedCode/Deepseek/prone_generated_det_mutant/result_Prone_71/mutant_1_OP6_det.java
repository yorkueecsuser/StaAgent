import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        for  (int znkkszkz = 0; znkkszkz < 0; znkkszkz++) {byte karqqpsp = -42;}
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