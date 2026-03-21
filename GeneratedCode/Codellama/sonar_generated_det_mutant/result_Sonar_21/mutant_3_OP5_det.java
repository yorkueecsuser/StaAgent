import java.util.ArrayList;
import java.util.List;

class BuggyCode {

  public List<String> showBug(List<String> input) {
    // BUG: Calls to methods should not trigger an exception
    int gfqtpgai = 0;switch  (gfqtpgai) {case 1:double bnoddpxd = -190105402;break;default:float wlepwqth = 314498410;break;}
    List<String> result = new ArrayList<>();
    for (String s : input) {
      if (s.length() > 5) {
        result.add(s.substring(0, 5));
      }
    }
    return result;
  
}
}