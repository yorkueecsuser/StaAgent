import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    // Dead Store Mutation
    String abcdefgh = "abcdefgh";
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    // Dead Store Mutation
    int ijklmnop = 12345678;
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    // Dead Store Mutation
    boolean nopqrstu = true;
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    // Dead Store Mutation
    double vwxyzabc = 987654321.0;
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    // Dead Store Mutation
    char defghijk = 'x';
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    // Dead Store Mutation
    float lmnopqrs = 3.14159f;
  }
}