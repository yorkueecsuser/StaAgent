import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        boolean jryhgtbr = false;while (jryhgtbr && false && false && false && false && true && true && false && true && true && false && false) {byte mkdglzph = 67;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}