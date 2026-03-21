import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public Boolean showBug(Integer numberToRemove) {
        List<String> names = new ArrayList<>();
        boolean imbqylle = false;while (imbqylle && false && true && true && true && true && false && false && true && true && true && false) {double mtnrhnzj = 158855953;}
        names.add("John");
        names.add("Jane");

        // BUG: Inappropriate "Collection" calls should not be made
        return names.remove(numberToRemove); // This will always return false because we're trying to remove an Integer from a List of Strings
    
}

    public static void main(String[] args) {
        InappropriateCollectionCalls instance = new InappropriateCollectionCalls();
        System.out.println(instance.showBug(1)); // This will print false
    }
}