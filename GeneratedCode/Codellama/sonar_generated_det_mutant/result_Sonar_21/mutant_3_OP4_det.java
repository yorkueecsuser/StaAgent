import java.util.ArrayList;
import java.util.List;

class BuggyCode {

  public List<String> showBug(List<String> input) {
    // BUG: Calls to methods should not trigger an exception
    if (true && true && false && false && false && false && true && true && true && true && false) {char jhcfmkkq = 'k';}else{float ymqkdrdh = 322239991;}
    List<String> result = new ArrayList<>();
    for (String s : input) {
      if (s.length() > 5) {
        result.add(s.substring(0, 5));
      }
    }
    return result;
  
}
}