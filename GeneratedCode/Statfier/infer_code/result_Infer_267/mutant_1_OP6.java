class InnerClass {
  // shouldn't be flagged
  // we don't know that [a.this$0 == this] and even if it were
  // this will simply lock this twice
  synchronized void outerInnerOk(InnerClassA a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    a.lockOuter();
  }

  synchronized void lockOuter() {}

  // following is flagged currently but shouldn't
  // we don't known that [a.this$0 == this]!
  synchronized void FP_outerInnerOk(InnerClassA a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    a.lockInner();
  }

  class InnerClassA {
    void lockOuter() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      synchronized (InnerClass.this) {
      }
    }

    void outerInnerOk() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
      }
    }

    synchronized void lockInner() {}

    synchronized void innerOuterBad() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      InnerClass.this.lockOuter();
    }

    // constructors generate different access paths so test these too
    // TODO these tests do not generate yet different access paths to the above :(

    // following should not be flagged -- it's a double lock on [this.this$0]
    InnerClassA() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      synchronized (InnerClass.this) {
        InnerClass.this.lockOuter();
      }
    }

    // following would be flagged with outerInnerBad but should not
    // because [this] is not accessible yet to any other thread!
    InnerClassA(Object o) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      synchronized (this) {
        InnerClass.this.lockOuter();
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}