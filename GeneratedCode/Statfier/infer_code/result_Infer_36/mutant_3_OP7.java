import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}