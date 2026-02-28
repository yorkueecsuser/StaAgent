import java.util.ArrayList;

class Holder {
  void doSomething() {}
}

class MultiHolder {
  ArrayList<Holder> holders = new ArrayList<>();

  void remove(int i) {
    Holder h = holders.get(i);
    h.doSomething();
    holders.remove(i);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is not set to return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also never be reached due to the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  int size() {
    return holders.size();
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}

class View {
  MultiHolder mh = new MultiHolder();

  void setCapacityBad(int n) {
    for (int i = n; i < mh.size(); ++i) {
      mh.remove(i);
    }
  }
}