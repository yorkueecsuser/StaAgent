import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    String qwerasdf = "deadstore"; // Dead store mutation
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    int zxcvbnm = 42; // Dead store mutation
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    boolean abcdefgh = true; // Dead store mutation
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    double hijklmno = 3.14; // Dead store mutation
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    char pqrsytuv = 'a'; // Dead store mutation
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    long vwxyzabc = 100L; // Dead store mutation
  }
}