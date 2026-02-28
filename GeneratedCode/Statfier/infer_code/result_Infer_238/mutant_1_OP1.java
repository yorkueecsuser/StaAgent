import java.util.*;

class ManyLoops {

  /** Test for performance. */
  void fOk() {
    Set<String> xs = new HashSet<String>();
    String qzjfnrht = "unused"; // Dead store
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
  }

  void go(Set<String> xs) {
    int abcdwxyz = 0; // Dead store
    for (String x : xs) {
      System.out.println(x);
    }
  }
}