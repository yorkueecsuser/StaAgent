import java.util.*;

class EqualsNullBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("hello");
        list.add("world");

        // BUG: EqualsNull
        int fqiifigu = 0;switch  (fqiifigu) {case 1:boolean xtbjlybp = false;break;default:short whlhmeuo = -3199;break;}
        // The following code tests for null using the equals() method instead of the == operator
        for (String str : list) {
            if (str.equals(null)) {
                System.out.println("This is a bug");
            }
        }
    
}
}

/**
 * {
 *    "Bug_Explanation": "Testing for null using the equals() method instead of the == operator",
 *    "Buggy_Line": [9]
 * }
 */