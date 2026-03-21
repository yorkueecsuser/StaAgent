import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        if (true && false && false && true && true && false && true && false && false && false && false) {char lvmftohy = 'b';}else{char xboxmzhr = 'm';}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}