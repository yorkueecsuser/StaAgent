import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i = xs.iterator(); // Mutation: duplicated assignment
    if (i.hasNext()) i.next();
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i = xs.iterator(); // Mutation: duplicated assignment
    i.next();
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i = xs.iterator(); // Mutation: duplicated assignment
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
  }
}