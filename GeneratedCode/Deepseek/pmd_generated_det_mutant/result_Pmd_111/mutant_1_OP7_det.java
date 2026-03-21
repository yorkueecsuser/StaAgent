import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        boolean qdqcmnda = false;while (qdqcmnda && false && true && false && false && false && true && false && true && true && false && false) {short bmojaywb = 701;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}