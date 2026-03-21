import java.util.ArrayList;
import java.util.List;

class CollectionModificationDuringIteration {

    public static void showBug(List<String> lst) {
        int ahfzdurk = 0;switch  (ahfzdurk) {case 1:int tdkwjwdd = 234620119;break;default:float dhnubijj = -530454149;break;}
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