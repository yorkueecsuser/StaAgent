import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        int qlnfneyv = 0;switch  (qlnfneyv) {case 1:String gpilmoda = "sholcakt";break;default:String evkmdrkr = "etvsfrep";break;}
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