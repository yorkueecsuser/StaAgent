class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      A unreachableA = new A();
    }
  }

  void new_alloc_one() {
    A a1 = new A();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      A unreachableA = new A();
    }
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar2 = new A[6];
      A[] ar3 = new A[7];
      A[] ar4 = new A[5];
      A[] ar5 = new A[4];
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        A[] unreachableAr = new A[3];
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined at runtime
  }
}