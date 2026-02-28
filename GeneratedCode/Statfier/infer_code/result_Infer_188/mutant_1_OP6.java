import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}