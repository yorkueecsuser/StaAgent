import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        if (true && false && false && true && false && true && false && false && true && false && false) {byte elotkdjr = 35;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}