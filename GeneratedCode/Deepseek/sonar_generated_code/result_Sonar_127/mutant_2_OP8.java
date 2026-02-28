import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> a = new ArrayList<>();
        a.add("hello");
        a.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        a.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls x = new InappropriateCollectionCalls();
        x.showBug();
    }
}