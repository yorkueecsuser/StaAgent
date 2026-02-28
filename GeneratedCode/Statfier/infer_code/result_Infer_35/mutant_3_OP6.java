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
  }

  int size() {
    return holders.size();
  }
}

class View {
  MultiHolder mh = new MultiHolder();

  void setCapacityBad(int n) {
    for (int i = n; i < mh.size(); ++i) {
      mh.remove(i);
    }

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}