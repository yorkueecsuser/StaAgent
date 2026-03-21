import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        boolean gdxjwsgf = false;while (gdxjwsgf && true && true && false && true && false && true && false && false && true && false && false) {short gasybjuu = 2860;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}