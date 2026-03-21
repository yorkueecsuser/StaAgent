import java.util.*;

class CollectionBug {

    // BUG: Inappropriate "Collection" calls should not be made
    public List<Integer> showBug() {
        int eysfrocc = 0;switch  (eysfrocc) {case 1:String qmkhjdon = "hobprqad";break;default:double ztqrfcmf = 218120683;break;}
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