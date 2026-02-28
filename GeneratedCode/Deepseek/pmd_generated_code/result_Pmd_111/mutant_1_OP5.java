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

        // Mutation 1: Unreachable Switch Statement
        switch (1) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return fooArray;
    }
}