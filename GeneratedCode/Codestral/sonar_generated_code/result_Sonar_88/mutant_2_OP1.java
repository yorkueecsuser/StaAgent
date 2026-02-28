import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return strings.toArray(new String[0]);  // Fixed the BUG, pass an array of the proper type
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // Added a dead store
        String deadStoreVariable = "unused";

        // This will not throw a ClassCastException now
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}