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

  HashMap<String, String> x = new HashMap<String, String>();

  public Map<String, String> getX() {
    return new HashMap<String, String>();
  }

  public void doGoodThings1() {
    Map<String, String> x = new HashMap<String, String>();
    x.put("key", "value");
  }

  public void doGoodThings2() {
    new HashMap<String, String>().put("key", "value");
  }

  public void doGoodThings3() {
    getX().put("key", "value");
  }

  public void doGoodThings4() {
    x.put("key", "value");
  }
}