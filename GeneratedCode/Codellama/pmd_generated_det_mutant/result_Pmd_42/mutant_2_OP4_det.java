import java.util.*;

class EqualsNullBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        if (true && true && true && true && false && false && false && true && true && true && false) {float hquvnvmk = -551817314;}else{byte rbysoylz = 123;}
        list.add("hello");
        list.add("world");

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