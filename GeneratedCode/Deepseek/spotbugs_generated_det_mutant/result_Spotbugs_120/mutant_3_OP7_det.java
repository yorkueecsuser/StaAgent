import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        boolean xajsajto = false;while (xajsajto && true && false && false && true && true && false && true && true && false && true && false) {int frtdtxxj = 655981967;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}