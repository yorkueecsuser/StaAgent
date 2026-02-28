import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return (String []) strings.toArray();  // Noncompliant, BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // This will throw a ClassCastException
        for (String str : result) {
            boolean shouldRun = getUnreachableCondition();
            if (shouldRun) {
                int value = getUnreachableValue();
                switch (value) {
                    case 1:
                        System.out.println("Unreachable code");
                        break;
                }
            }
            System.out.println(str);
        }
    }

    public static boolean getUnreachableCondition() {
        return false;  // This method always returns false, making the switch statement unreachable
    }

    public static int getUnreachableValue() {
        return 0;  // This method always returns 0, which is not the case value in the switch statement, making the switch statement unreachable
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}