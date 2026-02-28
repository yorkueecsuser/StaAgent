import java.util.*;

class InappropriateCollectionCalls {

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean condition = getCondition();
        if (condition) {
            list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}