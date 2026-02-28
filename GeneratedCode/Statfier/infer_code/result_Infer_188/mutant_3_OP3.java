import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  void removeInvalidatesNonEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.remove(i);
      Object o = null;
      if (l.isEmpty()) {
        o.toString();
      }
    }
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  void clearCausesEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.clear();
      Object o = null;
      if (l.isEmpty()) {
        o.toString();
      }
    }
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  // don't fully understand why we don't get this one; model should allow it
  void FN_addInvalidatesEmptinessNPE(List l) {
    if (l.isEmpty()) {
      l.add(0, new Object());
      Object o = null;
      if (!l.isEmpty()) {
        o.toString();
      }
    }
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      System.out.println("This is an unreachable block");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true in some cases if needed
  }
}