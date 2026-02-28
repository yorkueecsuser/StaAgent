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

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one=

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  public void doBadThings3() {
    getMap().get(1); // or this one

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  public void doBadThings4() {
    map.get(1); // or this one

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("And yet another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}