import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // Noncompliant; StackOverflowException if objs.hashCode() called
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // Noncompliant; behavior undefined
        // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // Noncompliant; always true
        // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // Noncompliant; NOOP
        // BUG: Collections should not be passed as arguments to their own methods

        // Mutation Operator name: Unreachable switch statement
        // Mutation Operator description: Inserting an unreachable switch statement into a randomly selected basic block in the program.
        // The switch condition must always evaluate to false to make it unreachable.
        // Unreachable switch example
        boolean condition = getCondition();
        switch(condition) {
            case false:
                System.out.println("This will never be executed");
                break;
            default:
                System.out.println("This will always be executed");
                break;
        }
    }

    // This is a method that is never called in the original code
    private boolean getCondition() {
        return false;
    }
}