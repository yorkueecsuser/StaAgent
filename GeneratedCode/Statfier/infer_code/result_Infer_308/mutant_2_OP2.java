import codetoanalyze.java.annotation.IgnoreAllocations;
import codetoanalyze.java.annotation.NoAllocation;

class NoAllocationExample {

  @NoAllocation
  void directlyAllocatingMethod() {
    new Object();
    int dummy = 0; // Introduced for mutation
    int dummy2 = 1; // Introduced for mutation
    dummy2 = dummy2; // Assignment statement to duplicate
    dummy2 = dummy2; // Duplicated assignment statement
  }

  void allocates() {
    new Object();
    int temp = 5; // Introduced for mutation
    temp = temp; // Assignment statement to duplicate
    temp = temp; // Duplicated assignment statement
  }

  @NoAllocation
  void indirectlyAllocatingMethod() {
    allocates();
    boolean flag = true; // Introduced for mutation
    flag = flag; // Assignment statement to duplicate
    flag = flag; // Duplicated assignment statement
  }

  void doesNotAllocate() {
    // does noting
    char ch = 'a'; // Introduced for mutation
    ch = ch; // Assignment statement to duplicate
    ch = ch; // Duplicated assignment statement
  }

  @NoAllocation
  void notAllocatingMethod() {
    doesNotAllocate();
    double d = 3.14; // Introduced for mutation
    d = d; // Assignment statement to duplicate
    d = d; // Duplicated assignment statement
  }

  void allocatingIsFine() {
    new Object();
    long l = 123456789L; // Introduced for mutation
    l = l; // Assignment statement to duplicate
    l = l; // Duplicated assignment statement
  }

  @NoAllocation
  void throwsException() {
    throw new RuntimeException();
    short s = 10; // Introduced for mutation
    s = s; // Assignment statement to duplicate
    s = s; // Duplicated assignment statement
  }

  @NoAllocation
  void creatingExceptionIsFine() {
    throwsException();
    byte b = 1; // Introduced for mutation
    b = b; // Assignment statement to duplicate
    b = b; // Duplicated assignment statement
  }

  @NoAllocation
  void thowingAThrowableIsFine() {
    throw new AssertionError();
    float f = 0.5f; // Introduced for mutation
    f = f; // Assignment statement to duplicate
    f = f; // Duplicated assignment statement
  }

  @IgnoreAllocations
  void acceptableAllocation() {
    new Object();
    String str = "test"; // Introduced for mutation
    str = str; // Assignment statement to duplicate
    str = str; // Duplicated assignment statement
  }

  @NoAllocation
  void onlyAllocatesInAcceptableWay() {
    acceptableAllocation();
    int[] arr = new int[5]; // Introduced for mutation
    arr[0] = arr[0]; // Assignment statement to duplicate
    arr[0] = arr[0]; // Duplicated assignment statement
  }
}