import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, ensuring the switch is unreachable
  }
}