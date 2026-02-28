import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Mutated line: Duplication operator
        list.remove(1);  // Assigning 1 to an integer variable
        list.remove(1);  // Passing the integer variable instead of a String to the remove method, causing a compile error

        // The original line remains here
        list.remove(1);
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}