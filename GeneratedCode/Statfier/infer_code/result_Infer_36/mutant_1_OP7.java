import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in hasNextOk");
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in hasNextBad");
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in hasNextNotTooBadOk");
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in hasNextInterproceduralBad");
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in hasNextInterproceduralOk");
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in getSingleElementOk");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}