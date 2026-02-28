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
  }

  void go(Set<String> xs) {
    Iterator<String> iterator = xs.iterator();
    do {
      if (iterator.hasNext()) {
        String x = iterator.next();
        System.out.println(x);
      } else {
        break;
      }
    } while (true);
  }
}