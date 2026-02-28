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
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        // Do nothing
        break;
    }
  }

  void go(Set<String> xs) {
    for (String x : xs) {
      System.out.println(x);
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}