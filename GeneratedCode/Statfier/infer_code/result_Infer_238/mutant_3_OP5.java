import java.util.*;

class ManyLoops {

  /** Test for performance. */
  void fOk() {
    Set<String> xs = new HashSet<String>();
    go(xs);
    go(xs);
    go(xs);
    go(xs);
    go(xs);
    go(xs);
    go(xs);
    go(xs);
    go(xs);
    go(xs);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  void go(Set<String> xs) {
    for (String x : xs) {
      System.out.println(x);
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}