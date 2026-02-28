import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
  }

  void allocates() {
    new Object();
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
  }

  void doesNotAllocate() {
    // does noting
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
  }

  void allocatingIsFine() {
    new Object();
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
  }

  // Mutants
  @NoAllocation
  void directlyAllocatingMethodb() {
    new Object();
  }

  void allocatesb() {
    new Object();
  }

  @NoAllocation
  void indirectlyAllocatingMethodb() {
    allocatesb();
  }

  void doesNotAllocateb() {
    // does noting
  }

  @NoAllocation
  void notAllocatingMethodb() {
    doesNotAllocateb();
  }

  void allocatingIsFineb() {
    new Object();
  }

  @NoAllocation
  void throwsExceptionb() {
    throw new RuntimeException();
  }

  @NoAllocation
  void creatingExceptionIsFineb() {
    throwsExceptionb();
  }

  @NoAllocation
  void thowingAThrowableIsFineb() {
    throw new AssertionError();
  }

  @IgnoreAllocations
  void acceptableAllocationb() {
    new Object();
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWayb() {
    acceptableAllocationb();
  }
}