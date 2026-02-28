import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    // Dead Store Mutation
    String qjvbnrht = "unusedVariable";
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    // Dead Store Mutation
    int xwvfrtgb = 42;
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    // Dead Store Mutation
    double yuiopasd = 3.14;
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    // Dead Store Mutation
    boolean zxcvbnml = true;
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    // Dead Store Mutation
    char asdfghjk = 'a';
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    // Dead Store Mutation
    long qwertyui = 123456789L;
  }
}