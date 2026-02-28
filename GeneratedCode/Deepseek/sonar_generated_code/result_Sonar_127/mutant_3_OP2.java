import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
        
        // Mutated line: duplicate the print statement
        System.out.println("Mutated line: duplicate the print statement");
        System.out.println("Mutated line: duplicate the print statement");
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}