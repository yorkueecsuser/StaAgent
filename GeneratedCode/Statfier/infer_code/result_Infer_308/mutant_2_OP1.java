import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    String qvbnrhty = "unused"; // Dead Store
  }

  void allocates() {
    new Object();
    int wxyzabcd = 42; // Dead Store
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean rstuvqpo = true; // Dead Store
  }

  void doesNotAllocate() {
    // does noting
    char lmjkhgfz = 'a'; // Dead Store
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    double fghjklmn = 3.14; // Dead Store
  }

  void allocatingIsFine() {
    new Object();
    long opqrstuv = 123456789L; // Dead Store
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    float abcdefgh = 0.1f; // Dead Store
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    short ijklmnop = 10; // Dead Store
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    byte zyxwvuts = 8; // Dead Store
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    String pqrsabcd = "acceptable"; // Dead Store
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    int efghijkl = 99; // Dead Store
  }
}