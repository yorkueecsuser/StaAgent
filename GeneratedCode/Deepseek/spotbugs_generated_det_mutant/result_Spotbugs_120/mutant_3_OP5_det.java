import java.util.ArrayList;
import java.util.List;

class BugCode {
    public Object showBug() {
        List<Object> objects = new ArrayList<>();
        int dkqcuilp = 0;switch  (dkqcuilp) {case 1:String bjvvsjwn = "kyxujadb";break;default:float aszlhodt = -588906285;break;}
        objects.add("String");
        return (Integer) objects.get(0);  // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    
}
}