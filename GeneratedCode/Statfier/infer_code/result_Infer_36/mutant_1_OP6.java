import java.util.*;

class Iterators {
  void hasNextOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) i.next();
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  void hasNextBad(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    i.next();
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  /** Check that errors don't bubble up the call chain. */
  void hasNextNotTooBadOk(List<Integer> xs) {
    hasNextBad(xs);
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  void hasNextInterproceduralBad(List<Integer> xs) {
    getSingleElementOk(xs.iterator());
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  void hasNextInterproceduralOk(List<Integer> xs) {
    Iterator<Integer> i = xs.iterator();
    if (i.hasNext()) {
      getSingleElementOk(i);
    }
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  void getSingleElementOk(Iterator<Integer> i) {
    i.next();
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}