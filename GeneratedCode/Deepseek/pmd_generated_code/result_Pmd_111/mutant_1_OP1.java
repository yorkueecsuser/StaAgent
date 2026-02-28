import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // Mutation Start: Add an unused variable declaration
        String unused = "unused";
        // Mutation End

        // BUG: OptimizableToArrayCall
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    }
}