import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        if (false && false && true && false && true && true && true && true && false && false && false) {byte xjtyuaie = 120;}
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