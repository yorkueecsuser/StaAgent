import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        String[] fooArray = foos.toArray(new String[0]);

        // Mutation: Unreachable for loop
        boolean condition = false;
        if (condition) {
            for (int i = 0; i < 100; i++) {
                System.out.println("This is an unreachable for loop");
            }
        }

        return fooArray;
    }
}