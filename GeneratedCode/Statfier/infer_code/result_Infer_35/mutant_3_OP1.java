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
    // Dead store mutation
    String yvqzjxfl = "unusedVariable";
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
    // Dead store mutation
    int xkmtqjfn = 42;
  }
}