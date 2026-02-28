import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            list.remove(1);  // This line will never be reached because alwaysFalse is always false.
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}