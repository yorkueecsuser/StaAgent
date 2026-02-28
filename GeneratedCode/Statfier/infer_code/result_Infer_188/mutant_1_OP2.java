import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    boolean emptyCopy = l.isEmpty(); // Mutant: duplicated assignment
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
  }

  void removeInvalidatesNonEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.remove(i);
      Object o = null;
      Object oCopy = null; // Mutant: duplicated assignment
      if (l.isEmpty()) {
        o.toString();
      }
    }
  }

  void clearCausesEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.clear();
      Object o = null;
      Object oCopy = null; // Mutant: duplicated assignment
      if (l.isEmpty()) {
        o.toString();
      }
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
  }

  // don't fully understand why we don't get this one; model should allow it
  void FN_addInvalidatesEmptinessNPE(List l) {
    if (l.isEmpty()) {
      l.add(0, new Object());
      Object o = null;
      Object oCopy = null; // Mutant: duplicated assignment
      if (!l.isEmpty()) {
        o.toString();
      }
    }
  }
}