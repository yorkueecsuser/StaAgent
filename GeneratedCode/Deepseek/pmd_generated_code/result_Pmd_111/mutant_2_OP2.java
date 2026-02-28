import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // Original Code
        String[] fooArray = foos.toArray(new String[0]);

        // Mutant Code
        String[] fooArrayMutant = foos.toArray(new String[0]);

        // Unique Mutant Code
        String[] fooArrayMutantUnique = foos.toArray(new String[0]);

        return fooArray;
    }
}