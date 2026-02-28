import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    private boolean getCondition() {
        return false;
    }

    public String[] getStringArray(List<String> strings) {
        while (getCondition()) { // Inserted unreachable while loop
            System.out.println("This line will never be executed.");
        }
        return (String[]) strings.toArray(new String[0]); // Fixed the BUG
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

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