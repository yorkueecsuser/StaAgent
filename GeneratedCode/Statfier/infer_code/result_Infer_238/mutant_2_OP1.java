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
    // Dead Store Mutation
    String qwejfnrj = "unusedVariable";
  }

  void go(Set<String> xs) {
    for (String x : xs) {
      System.out.println(x);
    }
    // Dead Store Mutation
    int vbnrhtyu = 42;
  }
}