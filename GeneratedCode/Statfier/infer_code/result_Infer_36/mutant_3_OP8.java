import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    
    // Mutant
    Iterator<Integer> a = xs.iterator();
    if (a.hasNext()) a.next();
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    
    // Mutant
    Iterator<Integer> b = xs.iterator();
    b.next();
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    
    // Mutant
    hasNextBad(xs);
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    
    // Mutant
    getSingleElementOk(xs.iterator());
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    
    // Mutant
    Iterator<Integer> c = xs.iterator();
    if (c.hasNext()) {
      getSingleElementOk(c);
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    
    // Mutant
    Iterator<Integer> d = xs.iterator(); // This line will cause a compilation error, so we need to adjust it
    if (d.hasNext()) {
      d.next();
    }
  }
}