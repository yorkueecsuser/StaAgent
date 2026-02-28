class InnerClass {
  // shouldn't be flagged
  // we don't know that [a.this$0 == this] and even if it were
  // this will simply lock this twice
  synchronized void outerInnerOk(InnerClassA a) {
    a.lockOuter();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  synchronized void lockOuter() {}

  // following is flagged currently but shouldn't
  // we don't known that [a.this$0 == this]!
  synchronized void FP_outerInnerOk(InnerClassA a) {
    a.lockInner();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  class InnerClassA {
    void lockOuter() {
      synchronized (InnerClass.this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }

    void outerInnerOk() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }

    synchronized void lockInner() {}

    synchronized void innerOuterBad() {
      InnerClass.this.lockOuter();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable for loop
      }
    }

    // constructors generate different access paths so test these too
    // TODO these tests do not generate yet different access paths to the above :(

    // following should not be flagged -- it's a double lock on [this.this$0]
    InnerClassA() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }

    // following would be flagged with outerInnerBad but should not
    // because [this] is not accessible yet to any other thread!
    InnerClassA(Object o) {
      synchronized (this) {
        InnerClass.this.lockOuter();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}