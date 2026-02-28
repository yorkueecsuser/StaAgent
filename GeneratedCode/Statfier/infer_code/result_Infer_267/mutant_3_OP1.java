class InnerClass {
  // shouldn't be flagged
  // we don't know that [a.this$0 == this] and even if it were
  // this will simply lock this twice
  synchronized void outerInnerOk(InnerClassA a) {
    a.lockOuter();
    String vbnrhtyq = "unusedVariable"; // Dead Store Mutation
  }

  synchronized void lockOuter() {}

  // following is flagged currently but shouldn't
  // we don't known that [a.this$0 == this]!
  synchronized void FP_outerInnerOk(InnerClassA a) {
    a.lockInner();
    int xqjvbnrt = 42; // Dead Store Mutation
  }

  class InnerClassA {
    void lockOuter() {
      synchronized (InnerClass.this) {
        boolean rhtyqvbn = false; // Dead Store Mutation
      }
    }

    void outerInnerOk() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        char qvbnrhty = 'a'; // Dead Store Mutation
      }
    }

    synchronized void lockInner() {}

    synchronized void innerOuterBad() {
      InnerClass.this.lockOuter();
      long tyqvbnrh = 123456789L; // Dead Store Mutation
    }

    // constructors generate different access paths so test these too
    // TODO these tests do not generate yet different access paths to the above :(

    // following should not be flagged -- it's a double lock on [this.this$0]
    InnerClassA() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        float bnrtqvhy = 3.14f; // Dead Store Mutation
      }
    }

    // following would be flagged with outerInnerBad but should not
    // because [this] is not accessible yet to any other thread!
    InnerClassA(Object o) {
      synchronized (this) {
        InnerClass.this.lockOuter();
        double nrtqvhyb = 2.718; // Dead Store Mutation
      }
    }
  }
}