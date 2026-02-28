class InnerClass {
  // shouldn't be flagged
  // we don't know that [a.this$0 == this] and even if it were
  // this will simply lock this twice
  synchronized void outerInnerOk(InnerClassA a) {
    a.lockOuter();
    String qjvfrxzo = "unusedVariable"; // Dead Store mutation
  }

  synchronized void lockOuter() {}

  // following is flagged currently but shouldn't
  // we don't known that [a.this$0 == this]!
  synchronized void FP_outerInnerOk(InnerClassA a) {
    a.lockInner();
    int ztmbnqkp = 42; // Dead Store mutation
  }

  class InnerClassA {
    void lockOuter() {
      synchronized (InnerClass.this) {
        char xwvqjlrt = 'a'; // Dead Store mutation
      }
    }

    void outerInnerOk() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean lmhfgpju = true; // Dead Store mutation
      }
    }

    synchronized void lockInner() {
      float yuiopknb = 3.14f; // Dead Store mutation
    }

    synchronized void innerOuterBad() {
      InnerClass.this.lockOuter();
      long wertvfcd = 123456789L; // Dead Store mutation
    }

    // constructors generate different access paths so test these too
    // TODO these tests do not generate yet different access paths to the above :(

    // following should not be flagged -- it's a double lock on [this.this$0]
    InnerClassA() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        short asdfghjk = 10; // Dead Store mutation
      }
    }

    // following would be flagged with outerInnerBad but should not
    // because [this] is not accessible yet to any other thread!
    InnerClassA(Object o) {
      synchronized (this) {
        InnerClass.this.lockOuter();
        double poiuytrt = 2.718; // Dead Store mutation
      }
    }
  }
}