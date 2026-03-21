import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        int nsemencp = 0;switch  (nsemencp) {case 1:boolean ylfrotcj = false;break;default:String bljtpwal = "dwetzdgc";break;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}