import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        int oyqajqvc = 0;switch  (oyqajqvc) {case 1:String sxdusjoy = "tbggxznb";break;default:long uqikttvx = -388568237;break;}
        String[] fooArray = foos.toArray(new String[0]);

        return fooArray;
    
}
}