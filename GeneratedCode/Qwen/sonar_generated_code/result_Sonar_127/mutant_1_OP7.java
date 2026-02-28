import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsNumber = stringList.contains(123); // Here we are checking for an Integer in a List of Strings

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }

        return containsNumber;
    }

    public int showBug1() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        int indexOfNumber = stringList.indexOf(123); // Here we are searching for an Integer in a List of Strings

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }

        return indexOfNumber;
    }

    public boolean showBug2() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsString = integerList.contains("apple"); // Here we are checking for a String in a List of Integers

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }

        return containsString;
    }

    private boolean getCondition() {
        return false; // This method returns false, ensuring the loop is unreachable
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println("showBug: " + example.showBug());
        System.out.println("showBug1: " + example.showBug1());
        System.out.println("showBug2: " + example.showBug2());
    }
}