import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    private boolean getCondition() {
        return false;
    }
    
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        if (getCondition()) {
            String[] fooArray = foos.toArray(new String[0]);
            return fooArray;
        }

        return new Object[0];
    }
}