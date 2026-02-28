import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return (String []) strings.toArray();
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        boolean shouldRun = false;  // Unreachable if-else statement mutation
        if (shouldRun) {
            System.out.println("This code will never be executed");
        } else {
            for (String str : result) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}