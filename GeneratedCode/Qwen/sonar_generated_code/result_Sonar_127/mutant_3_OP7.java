import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsNumber = stringList.contains(123); // Here we are checking for an Integer in a List of Strings

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop in showBug.");
        }

        return containsNumber;
    }

    public int showBug1() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        int indexOfNumber = stringList.indexOf(123); // Here we are searching for an Integer in a List of Strings

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop in showBug1.");
        }

        return indexOfNumber;
    }

    public boolean showBug2() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsString = integerList.contains("apple"); // Here we are checking for a String in a List of Integers

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop in showBug2.");
        }

        return containsString;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the while loop effectively unreachable
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println("showBug: " + example.showBug());
        System.out.println("showBug1: " + example.showBug1());
        System.out.println("showBug2: " + example.showBug2());
    }
}