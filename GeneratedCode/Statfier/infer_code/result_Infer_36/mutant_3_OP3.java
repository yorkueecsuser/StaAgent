import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined
  }
}