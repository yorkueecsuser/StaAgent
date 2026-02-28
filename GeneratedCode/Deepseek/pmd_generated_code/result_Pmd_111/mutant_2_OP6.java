import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // Mutated Code: Unreachable for loop
        boolean unreachable = false;
        for (int i = 0; unreachable == true; i++) {
            System.out.println("Unreachable code");
        }

        // Original Code
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    }
}