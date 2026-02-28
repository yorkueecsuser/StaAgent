import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    int a = 5; // Hypothetical assignment
    int a = 5; // Duplicate of the above assignment
  }

  void allocates() {
    new Object();
    boolean b = true; // Hypothetical assignment
    boolean b = true; // Duplicate of the above assignment
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    char c = 'x'; // Hypothetical assignment
    char c = 'x'; // Duplicate of the above assignment
  }

  void doesNotAllocate() {
    // does noting
    double d = 3.14; // Hypothetical assignment
    double d = 3.14; // Duplicate of the above assignment
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    String e = "test"; // Hypothetical assignment
    String e = "test"; // Duplicate of the above assignment
  }

  void allocatingIsFine() {
    new Object();
    long f = 100L; // Hypothetical assignment
    long f = 100L; // Duplicate of the above assignment
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    float g = 2.718f; // Hypothetical assignment
    float g = 2.718f; // Duplicate of the above assignment
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    short h = 10; // Hypothetical assignment
    short h = 10; // Duplicate of the above assignment
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    byte i = 1; // Hypothetical assignment
    byte i = 1; // Duplicate of the above assignment
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    int j = 20; // Hypothetical assignment
    int j = 20; // Duplicate of the above assignment
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    int k = 30; // Hypothetical assignment
    int k = 30; // Duplicate of the above assignment
  }
}