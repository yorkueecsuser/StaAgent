import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        int yexvmthc = 0;switch  (yexvmthc) {case 1:int luwdrgee = -165041317;break;default:double cpugpgku = 566738702;break;}
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