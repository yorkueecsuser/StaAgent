import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
        String[] arr = new String[2];
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            if (i == 0) {
                list.add("baz");
            } else {
                list.add("qux");
            }
        }
        for (String element : arr) {
            list.add(element);
        }
    }

    private static boolean getCondition() {
        return false;
    }
}