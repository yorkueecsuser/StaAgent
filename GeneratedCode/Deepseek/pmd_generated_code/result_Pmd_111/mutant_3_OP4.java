import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // Mutated Code
        boolean shouldRun = foos.size() > 0;
        if (shouldRun) {
            String[] fooArray = foos.toArray(new String[0]);
            return fooArray;
        } else {
            String[] fooArray = new String[0];
            return fooArray;
        }
    }
}