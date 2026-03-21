import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        if (false && false && false && false && true && true && false && true && true && false && false) {long zzujugef = -940744047;}else{double gabfjdxp = -497860358;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}