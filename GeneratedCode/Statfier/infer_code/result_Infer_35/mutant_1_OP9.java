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
    int i = n;
    do {
      if (i < mh.size()) {
        mh.remove(i);
      }
    } while (++i < mh.size());
  }
}