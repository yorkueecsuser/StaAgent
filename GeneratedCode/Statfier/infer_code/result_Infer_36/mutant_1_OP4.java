import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
    } else {
      // This block is also unreachable
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
    } else {
      // This block is also unreachable
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
    } else {
      // This block is also unreachable
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
    } else {
      // This block is also unreachable
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
    } else {
      // This block is also unreachable
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
    } else {
      // This block is also unreachable
    }
  }

  // Helper method to always return false
  private boolean getCondition() {
    return false;
  }
}