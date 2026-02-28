import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public String[] showBug(List<String> strings) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }

    public static void main(String[] args) {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        try {
            String[] result = bugDemo.showBug(stringList);
            for (String s : result) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}