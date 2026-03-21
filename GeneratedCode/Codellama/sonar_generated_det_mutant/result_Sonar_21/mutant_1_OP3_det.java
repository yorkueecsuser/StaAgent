import java.util.ArrayList;
import java.util.List;

class BuggyCode {

  public List<String> showBug(List<String> input) {
    // BUG: Calls to methods should not trigger an exception
    if (false && false && false && true && false && true && false && true && true && true && false) {int uoahdwxx = 35072280;}
    List<String> result = new ArrayList<>();
    for (String s : input) {
      if (s.length() > 5) {
        result.add(s.substring(0, 5));
      }
    }
    return result;
  
}
}