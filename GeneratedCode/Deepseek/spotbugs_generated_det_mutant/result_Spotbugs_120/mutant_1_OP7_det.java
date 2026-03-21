import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        boolean xtzgbspo = false;while (xtzgbspo && false && false && true && true && false && true && false && false && true && true && false) {short sowbzrin = -5264;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}