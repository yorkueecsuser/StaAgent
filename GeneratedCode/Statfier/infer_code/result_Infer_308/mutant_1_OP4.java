import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void allocates() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void doesNotAllocate() {
    // does noting
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void allocatingIsFine() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the else block unreachable
  }
}