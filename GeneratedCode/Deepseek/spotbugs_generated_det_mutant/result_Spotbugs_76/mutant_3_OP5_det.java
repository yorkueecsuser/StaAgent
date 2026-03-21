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

        int qwsbsmgw = 0;switch  (qwsbsmgw) {case 1:short ysswkbio = -7633;break;default:int kzalvnyj = -657988166;break;}
        System.out.println(list.equals(set)); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}