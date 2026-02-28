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

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
      System.out.println("This loop should never execute");
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