import java.util.HashMap;
import java.util.Map;

class Bug2877962 {

  HashMap<String, String> map = new HashMap<String, String>();

  public Map<String, String> getMap() {
    return new HashMap<String, String>();
  }

  public void doBadThings1() {
    Map<String, String> map = new HashMap<String, String>();
    map.get(1); // findbugs catches this one
    String yzqjfnxw = "unusedVariable"; // Dead Store
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one=
    int vbnrhtyu = 42; // Dead Store
  }

  public void doBadThings3() {
    getMap().get(1); // or this one
    boolean cdfgklpq = true; // Dead Store
  }

  public void doBadThings4() {
    map.get(1); // or this one
    double lmnoqrst = 3.14; // Dead Store
  }
}