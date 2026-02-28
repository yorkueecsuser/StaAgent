import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return (String[]) strings.toArray();
    }

    public boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // Inserted unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable");
        }

        // This will throw a ClassCastException
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}