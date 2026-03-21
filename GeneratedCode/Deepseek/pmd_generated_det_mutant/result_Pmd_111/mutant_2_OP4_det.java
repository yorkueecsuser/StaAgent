import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        if (true && false && true && false && true && true && true && false && true && false && false) {float fyfodjao = -559213735;}else{long fiavpdim = -66701641;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}