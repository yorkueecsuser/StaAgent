import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        String[] fooArray = foos.toArray(new String[0]);

        boolean condition = getCondition(); // Mutation: Adding a non-final variable in if statement
        if (condition) {
            return fooArray;
        }

        return new Object[0]; // Mutation: Making unreachable code by adding a return statement
    }

    private boolean getCondition() { // Method to return a non-final variable
        return false;
    }
}