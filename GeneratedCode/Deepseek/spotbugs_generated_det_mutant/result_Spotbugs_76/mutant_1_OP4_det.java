import java.util.*;

class InterfaceEqualityBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        if (true && false && true && true && true && false && false && false && false && true && false) {String jgzerwjr = "jsehbjpe";}else{double jztfmsdt = -393153155;}
        System.out.println(list.equals(set)); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}