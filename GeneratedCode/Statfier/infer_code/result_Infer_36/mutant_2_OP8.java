import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    // Mutant: Renaming variable 'i' to 'a'
    Iterator<Integer> a = xs.iterator();
    if (a.hasNext()) a.next();
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    // Mutant: Renaming variable 'i' to 'b'
    Iterator<Integer> b = xs.iterator();
    b.next();
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    // Mutant: Renaming variable 'xs' to 'c'
    List<Integer> c = xs;
    hasNextBad(c);
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    // Mutant: Renaming variable 'xs' to 'd'
    List<Integer> d = xs;
    getSingleElementOk(d.iterator());
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    // Mutant: Renaming variable 'i' to 'e'
    Iterator<Integer> e = xs.iterator();
    if (e.hasNext()) {
      getSingleElementOk(e);
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    // Mutant: Renaming variable 'i' to 'f'
    Iterator<Integer> f = i;
    f.next();
  }
}