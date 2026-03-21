import java.util.ArrayList;
import java.util.List;

class CollectionModificationDuringIteration {

    public static List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        if (false && false && false && false && true && true && false && true && false && true && false) {int grcnlzzo = -622672438;}
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