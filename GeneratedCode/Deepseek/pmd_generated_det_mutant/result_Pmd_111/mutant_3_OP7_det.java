import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        boolean bpkhtfzu = false;while (bpkhtfzu && true && true && true && false && false && false && true && true && true && true && false) {String nfbqstox = "gubqljqz";}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}