import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    String qzjxrtbv = "unused";
  }

  void allocates() {
    new Object();
    int mfnbhdjq = 42;
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean vjkrhtyz = true;
  }

  void doesNotAllocate() {
    // does noting
    char gqzjxrtb = 'a';
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    double jxrtbvqz = 3.14;
  }

  void allocatingIsFine() {
    new Object();
    long krtbvqzm = 100L;
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    float rtbvqzmj = 2.718f;
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    short zbvqzmjf = 10;
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    byte bvqzmjfx = 5;
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    String zmjfxqzj = "acceptable";
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    String jfxqzjzm = "only";
  }
}