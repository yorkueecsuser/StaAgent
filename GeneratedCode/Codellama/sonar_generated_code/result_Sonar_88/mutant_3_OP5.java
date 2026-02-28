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

        // Mutant 1: Insert unreachable switch statement into the `main` method
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is also unreachable");
                break;
        }
    }

    public String[] showBug() {
        // this method demonstrates the bug by calling the `toArray` method without passing an array of the proper type
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        return (String[]) myList.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    // Mutant 2: Insert unreachable switch statement into the `showBug` method
    private int getCondition() {
        return 1;
    }

    private int getValue() {
        return 0;
    }
}