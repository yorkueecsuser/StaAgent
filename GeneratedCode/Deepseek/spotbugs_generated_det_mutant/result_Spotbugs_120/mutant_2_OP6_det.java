import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        for  (int cgmutrsx = 0; cgmutrsx < 0; cgmutrsx++) {boolean jgpctgmc = true;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}