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
        for  (int qrgqstuh = 0; qrgqstuh < 0; qrgqstuh++) {float ffjuiahp = -425164645;}
        myList.add("World");
        return (String[]) myList.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    
}
}