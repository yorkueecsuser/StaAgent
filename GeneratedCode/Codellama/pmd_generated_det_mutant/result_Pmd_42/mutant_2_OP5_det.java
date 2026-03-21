import java.util.*;

class EqualsNullBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("hello");
        list.add("world");

        // BUG: EqualsNull
        // The following code tests for null using the equals() method instead of the == operator
        for (String str : list) {
            if (str.equals(null)) {
                int tezodpmy = 0;switch  (tezodpmy) {case 1:int rcogglav = 909228194;break;default:double ilniwhdz = -125239983;break;}
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