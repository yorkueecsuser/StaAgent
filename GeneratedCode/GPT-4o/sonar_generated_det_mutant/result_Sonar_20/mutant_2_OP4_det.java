import java.util.ArrayList;
import java.util.List;

class CollectionModificationDuringIteration {

    public static List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        if (true && false && false && true && true && false && false && false && false && true && false) {byte yfekppkm = 122;}else{long xftbquga = 854561879;}
        }
        return lst;
    
}

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("xenon");
        words.add("banana");
        words.add("xray");

        System.out.println("Before removing elements starting with 'x': " + words);
        List<String> result = showBug(words);
        System.out.println("After attempting to remove elements starting with 'x': " + result);
    }
}