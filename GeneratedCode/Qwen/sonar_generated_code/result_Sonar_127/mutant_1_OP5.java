import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsNumber = stringList.contains(123); // Here we are checking for an Integer in a List of Strings

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case in showBug");
                break;
        }

        return containsNumber;
    }

    public int showBug1() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        int indexOfNumber = stringList.indexOf(123); // Here we are searching for an Integer in a List of Strings

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case in showBug1");
                break;
        }

        return indexOfNumber;
    }

    public boolean showBug2() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsString = integerList.contains("apple"); // Here we are checking for a String in a List of Integers

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case in showBug2");
                break;
        }

        return containsString;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println("showBug: " + example.showBug());
        System.out.println("showBug1: " + example.showBug1());
        System.out.println("showBug2: " + example.showBug2());
    }
}