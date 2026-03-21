import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        for  (int jseymhxh = 0; jseymhxh < 0; jseymhxh++) {byte umwvmzat = 64;}
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