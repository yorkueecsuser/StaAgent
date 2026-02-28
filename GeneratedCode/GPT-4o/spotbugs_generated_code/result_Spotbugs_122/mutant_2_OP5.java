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
    }

    public String[] showBug(Collection<String> c) {
        // Original buggy code
        String[] result = (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)

        // Inserting unreachable switch statement
        int unreachableValue = calculateValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break; 
            default:
                // No action needed
                break;
        }

        return result;
    }

    private int calculateValue() {
        // Dynamically determine the value to ensure the switch is unreachable
        return 0;
    }
}