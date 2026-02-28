import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
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
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
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
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
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
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}