import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    private boolean getUnreachableCondition() {
        // This method returns a false value to make the while loop unreachable
        return false;
    }

    public String[] getStringArray(List<String> strings) {
        // Adding an unreachable while loop to the code
        while (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        }

        return (String []) strings.toArray();
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}