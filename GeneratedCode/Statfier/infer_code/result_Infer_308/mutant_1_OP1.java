import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    String qzjxmtkp = "unused"; // Dead Store
  }

  void allocates() {
    new Object();
    int rhtyfjgh = 42; // Dead Store
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean lmnbvcxz = true; // Dead Store
  }

  void doesNotAllocate() {
    // does noting
    char wertypoi = 'a'; // Dead Store
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    double asdfghjk = 3.14; // Dead Store
  }

  void allocatingIsFine() {
    new Object();
    float poiuytrew = 2.71f; // Dead Store
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    long zxcvbnml = 123456789L; // Dead Store
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    short qwertyui = 100; // Dead Store
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    byte cvbnmklp = 10; // Dead Store
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    String uytrepoi = "still unused"; // Dead Store
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    float lkjhgfds = 1.618f; // Dead Store
  }
}