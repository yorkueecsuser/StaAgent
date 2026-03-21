import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        for  (int gnrhvuim = 0; gnrhvuim < 0; gnrhvuim++) {float znogrvuz = -71539134;}
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