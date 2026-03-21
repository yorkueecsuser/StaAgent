import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        if (false && false && true && false && true && false && false && true && true && false && false) {short bftvbbpk = 1623;}else{float xnwezgas = -286470354;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}