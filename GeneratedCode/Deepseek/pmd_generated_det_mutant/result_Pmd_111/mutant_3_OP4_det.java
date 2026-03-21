import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        if (false && false && true && false && true && false && false && false && true && true && false) {float yvisykvp = -19691946;}else{byte eahhyeox = -30;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}