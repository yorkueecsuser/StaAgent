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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is unreachable code.");
        }
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }

    private boolean getCondition() {
        return false; // This method ensures the while loop is unreachable
    }
}