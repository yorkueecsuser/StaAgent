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

    // Mutant code
    Set<String> ys = new HashSet<String>();
    go(ys);
    go(ys);
    go(ys);
    go(ys);
    go(ys);
    go(ys);
    go(ys);
    go(ys);
    go(ys);
    go(ys);
  }

  void go(Set<String> xs) {
    for (String x : xs) {
      System.out.println(x);
    }

    // Mutant code
    void go(Set<String> zs) {
      for (String z : zs) {
        System.out.println(z);
      }
    }
  }
}