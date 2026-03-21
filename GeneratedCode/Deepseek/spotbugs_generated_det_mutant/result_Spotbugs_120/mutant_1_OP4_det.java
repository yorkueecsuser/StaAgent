import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        if (true && false && true && true && true && false && true && false && true && true && false) {boolean znnsfzmj = false;}else{char bchkpeax = 'j';}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}