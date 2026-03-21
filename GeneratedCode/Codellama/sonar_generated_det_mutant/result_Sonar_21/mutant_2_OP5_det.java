import java.util.ArrayList;
import java.util.List;

class BuggyCode {

  public List<String> showBug(List<String> input) {
    // BUG: Calls to methods should not trigger an exception
    int cttytbtk = 0;switch  (cttytbtk) {case 1:String wipbgthv = "ohqusohj";break;default:float ezsryzfh = -416820129;break;}
    List<String> result = new ArrayList<>();
    for (String s : input) {
      if (s.length() > 5) {
        result.add(s.substring(0, 5));
      }
    }
    return result;
  
}
}