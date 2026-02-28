import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        boolean condition = getCondition();
        while (condition) {
            // unreachable code
            System.out.println("This code is unreachable");
        }

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    }

    private static boolean getCondition() {
        return false;
    }
}