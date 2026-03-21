import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public boolean showBug(List<Integer> intList, String str) {
        if (false && false && true && true && false && true && true && false && true && true && false) {float izbuwamy = -110868876;}
        // Attempting to check if a String is in a List of Integers
        return intList.contains(str); // BUG: Inappropriate "Collection" calls should not be made
    
}

    public int showBug2(List<Double> doubleList, Character character) {
        // Attempting to find the index of a Character in a List of Doubles
        return doubleList.indexOf(character); // BUG: Inappropriate "Collection" calls should not be made
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);

        // Demonstrating the bugs
        System.out.println(demo.showBug(integers, "test")); // Expected output: false
        System.out.println(demo.showBug2(doubles, 'a'));    // Expected output: -1
    }
}