import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        if (false && false && true && false && false && false && false && true && true && true && false) {int uodlezud = -908590573;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}