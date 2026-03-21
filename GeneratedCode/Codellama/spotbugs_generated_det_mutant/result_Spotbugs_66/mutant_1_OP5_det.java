import java.util.*;

class NullPointerBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(null);

        for (String str : list) {
            int xpbdmjsy = 0;switch  (xpbdmjsy) {case 1:double kyqpbdbi = 729524627;break;default:short bymnvrpq = 2117;break;}
            System.out.println(str.toUpperCase()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    
}
}