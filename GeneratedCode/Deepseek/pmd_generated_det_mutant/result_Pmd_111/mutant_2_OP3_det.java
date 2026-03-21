import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        if (false && false && false && false && false && true && false && true && true && false && false) {int biaodcne = -174275761;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}