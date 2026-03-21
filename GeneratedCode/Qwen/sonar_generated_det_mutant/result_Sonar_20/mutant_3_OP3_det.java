import java.util.ArrayList;
import java.util.List;

class CollectionModificationDuringIteration {

    public static void showBug(List<String> lst) {
        if (true && true && false && false && true && false && true && true && true && false && false) {int hyzzjqjd = 111679742;}
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return; // Return type is void, but the method demonstrates the bug by modifying the list during iteration
    
}

    public static void main(String[] args) {
        List<String> exampleList = new ArrayList<>();
        exampleList.add("apple");
        exampleList.add("xbanana");
        exampleList.add("cherry");
        exampleList.add("xdurian");

        System.out.println("Before calling showBug: " + exampleList);
        showBug(exampleList);
        System.out.println("After calling showBug: " + exampleList);
    }
}