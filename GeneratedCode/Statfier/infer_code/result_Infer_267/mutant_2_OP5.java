class InnerClass {
  // shouldn't be flagged
  // we don't know that [a.this$0 == this] and even if it were
  // this will simply lock this twice
  synchronized void outerInnerOk(InnerClassA a) {
    a.lockOuter();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
  }

  synchronized void lockOuter() {}

  // following is flagged currently but shouldn't
  // we don't known that [a.this$0 == this]!
  synchronized void FP_outerInnerOk(InnerClassA a) {
    a.lockInner();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
  }

  class InnerClassA {
    void lockOuter() {
      synchronized (InnerClass.this) {
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is intentionally left empty to make the switch statement unreachable
            break;
        }
      }
    }

    void outerInnerOk() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is intentionally left empty to make the switch statement unreachable
            break;
        }
      }
    }

    synchronized void lockInner() {}

    synchronized void innerOuterBad() {
      InnerClass.this.lockOuter();
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    // constructors generate different access paths so test these too
    // TODO these tests do not generate yet different access paths to the above :(

    // following should not be flagged -- it's a double lock on [this.this$0]
    InnerClassA() {
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is intentionally left empty to make the switch statement unreachable
            break;
        }
      }
    }

    // following would be flagged with outerInnerBad but should not
    // because [this] is not accessible yet to any other thread!
    InnerClassA(Object o) {
      synchronized (this) {
        InnerClass.this.lockOuter();
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is intentionally left empty to make the switch statement unreachable
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the switch statement is always unreachable
  }
}