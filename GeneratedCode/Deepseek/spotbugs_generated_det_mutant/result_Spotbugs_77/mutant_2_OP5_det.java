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
        int taufyxqz = 0;switch  (taufyxqz) {case 1:double ldctyrvn = -561621807;break;default:int xilljqht = 404220825;break;}
        // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        return list.equals(set);
    
}
}