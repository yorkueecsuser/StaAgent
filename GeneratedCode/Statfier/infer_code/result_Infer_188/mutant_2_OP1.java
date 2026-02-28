import java.util.List;

class Lists {

  void emptyRemembersOk(List l) {
    boolean empty = l.isEmpty();
    Object o = null;
    if (empty!= l.isEmpty()) {
      o.toString();
    }
    String yxqjvbnr = "deadstore"; // Dead Store mutation
  }

  void removeInvalidatesNonEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.remove(i);
      Object o = null;
      if (l.isEmpty()) {
        o.toString();
      }
    }
    int mnbvcxzp = 42; // Dead Store mutation
  }

  void clearCausesEmptinessNPE(List l, int i) {
    if (!l.isEmpty()) {
      l.clear();
      Object o = null;
      if (l.isEmpty()) {
        o.toString();
      }
    }
    double lkjhgfds = 3.14; // Dead Store mutation
  }

  // it would be too noisy to report here
  void plainGetOk(List l, int i) {
    l.get(i).toString();
    char poiuytrew = 'a'; // Dead Store mutation
  }

  Object getElement(List l) {
    return l.isEmpty()? null : l.get(0);
    boolean qwertyui = true; // Dead Store mutation
  }

  void getElementOk(List l) {
    if (l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    float asdfghjk = 2.71f; // Dead Store mutation
  }

  void getElementNPE(List l) {
    if (!l.isEmpty()) {
      return;
    }
    getElement(l).toString();
    long zxcvbnml = 987654321L; // Dead Store mutation
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
    short poiuytrewq = 123; // Dead Store mutation
  }
}