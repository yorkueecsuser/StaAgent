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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one=

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  public void doBadThings3() {
    getMap().get(1); // or this one

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  public void doBadThings4() {
    map.get(1); // or this one

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}