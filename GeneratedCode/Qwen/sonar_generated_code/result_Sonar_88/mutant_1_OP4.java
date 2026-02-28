import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public String[] showBug(List<String> strings) {
        // Introducing an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true.");
        } else {
            System.out.println("This is an unreachable else block.");
        }

        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true in other contexts, but here it keeps the else block unreachable
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