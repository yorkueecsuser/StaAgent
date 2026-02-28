import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}