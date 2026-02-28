class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      A a5 = new A();
    } else {
      // Some alternative code that will also never run
      A a6 = new A();
    }
  }

  void new_alloc_one() {
    A a1 = new A();
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      A a2 = new A();
    } else {
      // Some alternative code that will also never run
      A a3 = new A();
    }
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar2 = new A[6];
      A[] ar3 = new A[7];
      A[] ar4 = new A[5];
      A[] ar5 = new A[4];
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never run
        A[] ar6 = new A[8];
      } else {
        // Some alternative code that will also never run
        A[] ar7 = new A[9];
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the condition is always false, but it's dynamically determined
  }
}