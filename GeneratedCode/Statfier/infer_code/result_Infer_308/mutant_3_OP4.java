import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  void allocates() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  void doesNotAllocate() {
    // does noting
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  void allocatingIsFine() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being false at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}