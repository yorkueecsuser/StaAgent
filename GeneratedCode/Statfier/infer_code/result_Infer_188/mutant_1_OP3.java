import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      o.toString(); // This line is unreachable because condition is never set to true
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
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      o.toString(); // This line is unreachable because condition is never set to true
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
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      o.toString(); // This line is unreachable because condition is never set to true
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      l.get(i).toString(); // This line is unreachable because condition is never set to true
    }
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      return l.get(0); // This line is unreachable because condition is never set to true
    }
    return null;
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      getElement(l).toString(); // This line is unreachable because condition is never set to true
    }
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      getElement(l).toString(); // This line is unreachable because condition is never set to true
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
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      o.toString(); // This line is unreachable because condition is never set to true
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}