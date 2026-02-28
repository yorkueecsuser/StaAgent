class InnerClass {
  // shouldn't be flagged
  // we don't know that [a.this$0 == this] and even if it were
  // this will simply lock this twice
  synchronized void outerInnerOk(InnerClassA a) {
    a.lockOuter();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  synchronized void lockOuter() {}

  // following is flagged currently but shouldn't
  // we don't known that [a.this$0 == this]!
  synchronized void FP_outerInnerOk(InnerClassA a) {
    a.lockInner();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  class InnerClassA {
    void lockOuter() {
      synchronized (InnerClass.this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // unreachable while loop
        }
      }
    }

    void outerInnerOk() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // unreachable while loop
        }
      }
    }

    synchronized void lockInner() {}

    synchronized void innerOuterBad() {
      InnerClass.this.lockOuter();
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // unreachable while loop
      }
    }

    // constructors generate different access paths so test these too
    // TODO these tests do not generate yet different access paths to the above :(

    // following should not be flagged -- it's a double lock on [this.this$0]
    InnerClassA() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // unreachable while loop
        }
      }
    }

    // following would be flagged with outerInnerBad but should not
    // because [this] is not accessible yet to any other thread!
    InnerClassA(Object o) {
      synchronized (this) {
        InnerClass.this.lockOuter();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // unreachable while loop
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}