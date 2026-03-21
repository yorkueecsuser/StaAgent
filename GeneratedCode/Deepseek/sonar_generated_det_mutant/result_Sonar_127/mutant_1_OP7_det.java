import java.util.*;

class CollectionBug {

    // BUG: Inappropriate "Collection" calls should not be made
    public List<Integer> showBug() {
        boolean ztcodtoq = false;while (ztcodtoq && false && true && true && true && false && false && true && false && false && false && false) {int bsvgswql = -998315399;}
        List<String> collection = new ArrayList<>(Arrays.asList("Hello", "World"));

        // BUG: Inappropriate "Collection" calls should not be made
        collection.remove(0); // This will remove the string "Hello" instead of the integer 0

        return (List<Integer>) (List<?>) collection;
    
}

    public static void main(String[] args) {
        CollectionBug bug = new CollectionBug();
        List<Integer> result = bug.showBug();
        System.out.println(result);
    }
}