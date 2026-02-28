import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  void allocates() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  void doesNotAllocate() {
    // does noting
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  void allocatingIsFine() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      new Object();
    }
  }

  private boolean getCondition() {
    return false;
  }
}