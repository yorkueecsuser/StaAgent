import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // MUTANT: Inappropriate "Collection" calls should not be made
        boolean unreachableIfCondition = getCondition();
        if (unreachableIfCondition) {
            list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
        } else {
            // This is an unreachable branch which will cause a compile error.
            list.remove(0);  // This line should cause a compile error because 0 is an integer, not a String.
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }

    private boolean getCondition() {
        return false;
    }
}