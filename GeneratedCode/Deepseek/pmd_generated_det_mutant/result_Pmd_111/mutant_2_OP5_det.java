import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        int zdjozefy = 0;switch  (zdjozefy) {case 1:int tyrlbhgn = 223179295;break;default:long gsxjpepe = 481255005;break;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}