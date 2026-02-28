import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
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
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}