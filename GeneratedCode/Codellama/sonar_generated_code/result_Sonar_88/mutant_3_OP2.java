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
    }

    public String[] showBug() {
        // this method demonstrates the bug by calling the `toArray` method without passing an array of the proper type
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        return (String[]) myList.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }
}


// Mutant 1: Duplicate the assignment statement for `myArray`
String[] myArray = myList.toArray(new String[0]);
String[] myArray = myList.toArray(new String[0]);

for (String element : myArray) {
    System.out.println(element);
}

// Mutant 2: Duplicate the assignment statement for `myList`
List<String> myList = new ArrayList<>();
List<String> myList = new ArrayList<>();
myList.add("Hello");
myList.add("World");

String[] myArray = myList.toArray(new String[0]); // BUG: "Collection.toArray()" should be passed an array of the proper type

for (String element : myArray) {
    System.out.println(element);
}

// Mutant 3: Duplicate the assignment statement for `myArray` in `showBug` method
String[] myArray = (String[]) myList.toArray();
String[] myArray = (String[]) myList.toArray();

for (String element : myArray) {
    System.out.println(element);
}

// Mutant 4: Duplicate the assignment statement for `myList` in `showBug` method
List<String> myList = new ArrayList<>();
List<String> myList = new ArrayList<>();
myList.add("Hello");
myList.add("World");

String[] myArray = (String[]) myList.toArray();

for (String element : myArray) {
    System.out.println(element);
}