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
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one
  }

  public void doBadThings3() {
    getMap().get(1); // or this one
  }

  public void doBadThings4() {
    map.get(1); // or this one
  }

  // Mutated code starts here

  HashMap<String, String> b = new HashMap<String, String>();

  public Map<String, String> getCmap() {
    return new HashMap<String, String>();
  }

  public void doGoodThings1() {
    Map<String, String> c = new HashMap<String, String>();
    c.get(1); // findbugs catches this one
  }

  public void doGoodThings2() {
    new HashMap<String, String>().get(1); // not this one
  }

  public void doGoodThings3() {
    getCmap().get(1); // or this one
  }

  public void doGoodThings4() {
    b.get(1); // or this one
  }
}