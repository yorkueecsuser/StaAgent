import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsNumber = stringList.contains(123); // Here we are checking for an Integer in a List of Strings

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }

        return containsNumber;
    }

    public int showBug1() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        int indexOfNumber = stringList.indexOf(123); // Here we are searching for an Integer in a List of Strings

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }

        return indexOfNumber;
    }

    public boolean showBug2() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsString = integerList.contains("apple"); // Here we are checking for a String in a List of Integers

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }

        return containsString;
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println("showBug: " + example.showBug());
        System.out.println("showBug1: " + example.showBug1());
        System.out.println("showBug2: " + example.showBug2());
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // Always returns true to ensure the if-block is reachable
    }
}