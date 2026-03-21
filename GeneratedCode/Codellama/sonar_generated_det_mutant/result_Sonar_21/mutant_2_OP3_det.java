import java.util.ArrayList;
import java.util.List;

class BuggyCode {

  public List<String> showBug(List<String> input) {
    // BUG: Calls to methods should not trigger an exception
    if (true && false && false && true && false && false && true && true && false && false && false) {byte jtyofauh = 125;}
    List<String> result = new ArrayList<>();
    for (String s : input) {
      if (s.length() > 5) {
        result.add(s.substring(0, 5));
      }
    }
    return result;
  
}
}