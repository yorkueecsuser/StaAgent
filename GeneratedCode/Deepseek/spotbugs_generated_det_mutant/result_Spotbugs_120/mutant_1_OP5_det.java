import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        int bnkvpulp = 0;switch  (bnkvpulp) {case 1:float kaadukyz = -741306266;break;default:long kvshmcsc = 70028567;break;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}