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
    String abcd1234; // Dead store mutation
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one=
    int efgh5678; // Dead store mutation
  }

  public void doBadThings3() {
    getMap().get(1); // or this one
    boolean ijkl9012; // Dead store mutation
  }

  public void doBadThings4() {
    map.get(1); // or this one
    double mnop3456; // Dead store mutation
  }
}