import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    String abcdefgh = "deadstore"; // Dead Store Mutation
  }

  void removeInvalidatesNonEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.remove(i);
      Object o = null;
      if (l.isEmpty()) {
        o.toString();
      }
    }
    int ijklmnop = 42; // Dead Store Mutation
  }

  void clearCausesEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.clear();
      Object o = null;
      if (l.isEmpty()) {
        o.toString();
      }
    }
    double nopqrstu = 3.14; // Dead Store Mutation
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    char stuvwxyz = 'x'; // Dead Store Mutation
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
    boolean vwxyzabc = true; // Dead Store Mutation
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    float wxyzabcd = 2.71f; // Dead Store Mutation
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    long xyzabcde = 987654321L; // Dead Store Mutation
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
    short yzabcdef = 123; // Dead Store Mutation
  }
}