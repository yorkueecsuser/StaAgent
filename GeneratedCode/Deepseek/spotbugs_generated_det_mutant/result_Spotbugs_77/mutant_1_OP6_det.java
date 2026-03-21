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
        for  (int lgbxqsvw = 0; lgbxqsvw < 0; lgbxqsvw++) {float unlgbahc = 659838839;}
        // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        return list.equals(set);
    
}
}