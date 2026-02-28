import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void allocates() {
    new Object();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void doesNotAllocate() {
    // does noting
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  void allocatingIsFine() {
    new Object();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}