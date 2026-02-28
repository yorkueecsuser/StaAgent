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

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
      System.out.println("This will never be printed");
    }
  }

  void go(Set<String> xs) {
    for (String x : xs) {
      System.out.println(x);
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}