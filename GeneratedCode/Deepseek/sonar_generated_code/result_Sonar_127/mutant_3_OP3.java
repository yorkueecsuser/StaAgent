import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
    }

    // Mutant code
    public void showMutant() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Mutant: Unreachable if statement
        boolean isCondition = false;
        if (isCondition) {
            list.remove(1);
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
        demo.showMutant();
    }
}