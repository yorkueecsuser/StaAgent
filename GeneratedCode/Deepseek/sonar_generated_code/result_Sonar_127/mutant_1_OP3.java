import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Added mutant condition
        boolean mutantCondition = true;

        // BUG: Inappropriate "Collection" calls should not be made
        // Mutant condition: list.remove(1) should never be reachable
        if (mutantCondition) {
            list.remove("world");
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}