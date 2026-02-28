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

    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  public void doBadThings2() {
    new HashMap<String, String>().get(1); // not this one=

    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  public void doBadThings3() {
    getMap().get(1); // or this one

    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  public void doBadThings4() {
    map.get(1); // or this one

    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}