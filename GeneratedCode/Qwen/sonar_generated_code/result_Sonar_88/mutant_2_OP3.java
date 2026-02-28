import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public String[] showBug(List<String> strings) {
        // Introduced an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }

        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
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