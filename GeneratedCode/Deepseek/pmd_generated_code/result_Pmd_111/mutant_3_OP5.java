import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        // Mutation Operator: Unreachable switch statement
        String[] fooArray = foos.toArray(new String[0]);
        boolean mutantSwitch = getMutantCondition();
        switch (mutantSwitch) {
            default:
                break;
        }

        return fooArray;
    }

    private boolean getMutantCondition() {
        return false;
    }
}