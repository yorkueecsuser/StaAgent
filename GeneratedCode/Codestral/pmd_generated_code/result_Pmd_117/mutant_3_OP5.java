import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutant: Unreachable switch statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            int value = 0;
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    private boolean getCondition() {
        return false; // The switch statement is always unreachable
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}