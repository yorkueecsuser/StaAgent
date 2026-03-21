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
        int yhotmosx = 0;switch  (yhotmosx) {case 1:boolean fbuumhib = false;break;default:float ejioioyo = 272450502;break;}
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        // BUG: Inappropriate "Collection" calls should not be made
        int indexOfString = integerList.indexOf("apple"); // This line contains the bug

        return indexOfString;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains number: " + demo.showBug());
        System.out.println("Index of string: " + demo.showBug2());
    }
}