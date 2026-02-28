import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Mutant Code Start
        boolean mutantCondition = false;
        if(mutantCondition) {
            // This line should cause a compile error because 1 is an integer, not a String.
            list.remove(1); 
            // Mutant Code End
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}