import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        String deadStore1 = "abcdefgh"; // Dead store variable

        // BUG: Inappropriate "Collection" calls should not be made
        list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}