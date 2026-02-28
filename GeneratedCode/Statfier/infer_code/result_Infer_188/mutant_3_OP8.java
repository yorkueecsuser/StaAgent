import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    // Mutant
    boolean a = l.isEmpty();
    Object b = null;
    if (a!= l.isEmpty()) {
      b.toString();
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
    // Mutant
    if (!l.isEmpty()) {
      l.remove(i);
      Object c = null;
      if (l.isEmpty()) {
        c.toString();
      }
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
    // Mutant
    if (!l.isEmpty()) {
      l.clear();
      Object d = null;
      if (l.isEmpty()) {
        d.toString();
      }
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    // Mutant
    l.get(i).toString();
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
    // Mutant
    return l.isEmpty()? null : l.get(0);
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant
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
    // Mutant
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
      if (!l.isEmpty()) {
        o.toString();
      }
    }
    // Mutant
    if (l.isEmpty()) {
      l.add(0, new Object());
      Object e = null;
      if (!l.isEmpty()) {
        e.toString();
      }
    }
  }
}