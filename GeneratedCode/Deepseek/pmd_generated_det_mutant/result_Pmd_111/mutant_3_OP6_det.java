import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        for  (int rqijvwok = 0; rqijvwok < 0; rqijvwok++) {short syvnuord = 2138;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}