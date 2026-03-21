import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.add(1);
        set.add(1);
        int qdrmozns = 0;switch  (qdrmozns) {case 1:boolean ulxwfzdo = false;break;default:short gfrglnhe = 359;break;}
        // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        return list.equals(set);
    
}
}