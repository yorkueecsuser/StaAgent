import java.util.HashMap;
import java.util.Map;

class Bug2877962 {

  HashMap<String, String> map = new HashMap<String, String>();
  HashMap<String, String> mapCopy = new HashMap<String, String>(); // Duplicate assignment

  public Map<String, String> getMap() {
    return new HashMap<String, String>();
  }

  public void doBadThings1() {
    Map<String, String> map = new HashMap<String, String>();
    Map<String, String> mapDuplicate = new HashMap<String, String>(); // Duplicate assignment
    map.get(1); // findbugs catches this one
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one=
  }

  public void doBadThings3() {
    getMap().get(1); // or this one
  }

  public void doBadThings4() {
    map.get(1); // or this one
    HashMap<String, String> mapDuplicate = new HashMap<String, String>(); // Duplicate assignment
  }
}