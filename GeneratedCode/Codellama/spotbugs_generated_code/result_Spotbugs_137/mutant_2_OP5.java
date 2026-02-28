import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Unreachable switch statement mutant
        int value = 0;
        switch(value) {
            case 1:
                System.out.println("Reached unreachable code");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}