import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  void allocates() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  void doesNotAllocate() {
    // does noting
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  void allocatingIsFine() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}