import java.util.*;
class InappropriateCollectionCalls {
    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
    }

    public void showMutant() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        while (false) {
            // This code will never be executed, making it unreachable.
        }
        // BUG: Inappropriate "Collection" calls should not be made
        list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
        demo.showMutant();
    }
}