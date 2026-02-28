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

    // Unreachable if statement mutant
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  int size() {
    return holders.size();
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime, making the if block unreachable
  }
}

class View {
  MultiHolder mh = new MultiHolder();

  void setCapacityBad(int n) {
    for (int i = n; i < mh.size(); ++i) {
      mh.remove(i);
    }

    // Unreachable if statement mutant
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in setCapacityBad.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime, making the if block unreachable
  }
}