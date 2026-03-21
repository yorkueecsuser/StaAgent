import java.util.*;

class EqualsNullBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("hello");
        list.add("world");

        boolean iihqcnpg = false;while (iihqcnpg && true && true && false && false && true && false && true && true && true && false && false) {char btksxyjx = 'f';}
        // BUG: EqualsNull
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