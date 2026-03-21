import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        int ptjwabxp = 0;switch  (ptjwabxp) {case 1:float ithcavrc = 474411143;break;default:short pvuezsiq = 2895;break;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}