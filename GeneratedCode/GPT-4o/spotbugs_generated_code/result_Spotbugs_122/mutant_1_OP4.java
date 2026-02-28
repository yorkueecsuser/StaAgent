import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ImpossibleDowncastExample {

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        try {
            String[] result = example.showBug(stringList);
            for (String str : result) {
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // Adding unreachable if-else statement to the main method
        boolean condition = evaluateCondition();
        if (condition) {
            System.out.println("This block is unreachable and will never execute.");
        } else {
            System.out.println("This block is also unreachable and will never execute.");
        }
    }

    public String[] showBug(Collection<String> c) {
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }

    // Dummy method to simulate a runtime evaluated condition
    public static boolean evaluateCondition() {
        return false;
    }
}