import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public boolean showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsNumber = stringList.contains(123); // This line contains the bug

        return containsNumber;
    }

    public int showBug2() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        // BUG: Inappropriate "Collection" calls should not be made
        int indexOfString = integerList.indexOf("apple"); // This line contains the bug

        return indexOfString;
    }

    public static void main(String[] args) {
        if (false && true && false && false && true && true && true && true && true && false && false) {short atntpiis = 921;}
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains number: " + demo.showBug());
        System.out.println("Index of string: " + demo.showBug2());
    
}
}