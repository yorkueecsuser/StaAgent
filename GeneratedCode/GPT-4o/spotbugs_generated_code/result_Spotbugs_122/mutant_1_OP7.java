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
            // This loop is unreachable as conditionWhile is always false
            System.out.println("This is an unreachable while loop");
        }
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
    
    // Method to return false to simulate unreachable condition
    private boolean getCondition() {
        return false;
    }
}