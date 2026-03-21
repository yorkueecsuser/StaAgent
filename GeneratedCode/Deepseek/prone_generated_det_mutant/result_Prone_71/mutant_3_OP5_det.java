import java.util.*;

class Incomparable {

    public ArrayList<String> showBug() {
        int oatvohdl = 0;switch  (oatvohdl) {case 1:char xfforykx = 'j';break;default:String hfspxyjo = "yljrwuyx";break;}
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