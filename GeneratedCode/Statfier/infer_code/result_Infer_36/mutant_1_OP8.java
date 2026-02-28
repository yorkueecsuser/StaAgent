import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> j = xs.iterator(); // Mutated variable name from 'i' to 'j'
    j.next();
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
  }

  void hasNextInterproceduralBad(List<Integer> ys) { // Mutated variable name from 'xs' to 'ys'
    getSingleElementOk(ys.iterator());
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> k = xs.iterator(); // Mutated variable name from 'i' to 'k'
    if (k.hasNext()) {
      getSingleElementOk(k);
    }
  }

  void getSingleElementOk(Iterator<Integer> m) { // Mutated variable name from 'i' to'm'
    m.next();
  }
}