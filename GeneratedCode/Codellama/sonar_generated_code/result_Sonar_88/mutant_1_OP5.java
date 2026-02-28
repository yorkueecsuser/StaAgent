import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[0]); // BUG: "Collection.toArray()" should be passed an array of the proper type

        for (String element : myArray) {
            System.out.println(element);
        }

        // Inserted unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1: {
                // This code is unreachable because the switch expression is always 0
                System.out.println("This code is unreachable!");
                break;
            }
            default: {
                break;
            }
        }
    }

    public String[] showBug() {
        // this method demonstrates the bug by calling the `toArray` method without passing an array of the proper type
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        return (String[]) myList.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    // Added method to avoid using compile-time constants
    private int getValue() {
        return new Random().nextInt();
    }
}