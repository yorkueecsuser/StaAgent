import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    // Mutant: Renaming 'empty' to 'a'
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
    // Mutant: Renaming 'i' to 'c'
    if (!l.isEmpty()) {
      l.remove(c);
      Object d = null;
      if (l.isEmpty()) {
        d.toString();
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
    // Mutant: Renaming 'i' to 'e'
    if (!l.isEmpty()) {
      l.clear();
      Object f = null;
      if (l.isEmpty()) {
        f.toString();
      }
    }
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    // Mutant: Renaming 'i' to 'g'
    l.get(g).toString();
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
    // Mutant: Renaming 'l' to 'h'
    return h.isEmpty()? null : h.get(0);
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Renaming 'l' to 'j'
    if (j.isEmpty()) {
      return;
    }
    getElement(j).toString();
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    // Mutant: Renaming 'l' to 'k'
    if (!k.isEmpty()) {
      return;
    }
    getElement(k).toString();
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
    // Mutant: Renaming 'o' to'm'
    if (l.isEmpty()) {
      l.add(0, new Object());
      Object m = null;
      if (!l.isEmpty()) {
        m.toString();
      }
    }
  }
}