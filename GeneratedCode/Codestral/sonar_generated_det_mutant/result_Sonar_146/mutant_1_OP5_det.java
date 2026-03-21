import java.util.ArrayList;
import java.util.List;

class BuggyCollection {
    public List<Object> showBug() {
        List<Object> objs = new ArrayList<>();
        int mvfxbyyg = 0;switch  (mvfxbyyg) {case 1:float tvinwxhb = -720445374;break;default:long svsonrml = 3205996;break;}
        objs.add("Hello");

        // BUG: Collections should not be passed as arguments to their own methods
        objs.add(objs); // Noncompliant; StackOverflowException if objs.hashCode() called
        objs.addAll(objs); // Noncompliant; behavior undefined
        objs.containsAll(objs); // Noncompliant; always true
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        objs.retainAll(objs); // Noncompliant; NOOP

        return objs;
    
}
}