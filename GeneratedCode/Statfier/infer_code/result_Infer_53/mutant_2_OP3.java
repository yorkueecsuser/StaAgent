class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      A a5 = new A(); // This line is unreachable
    }
  }

  void new_alloc_one() {
    A a1 = new A();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      A a2 = new A(); // This line is unreachable
    }
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar2 = new A[6];
      A[] ar3 = new A[7];
      A[] ar4 = new A[5];
      A[] ar5 = new A[4];
      
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        A[] ar6 = new A[8]; // This line is unreachable
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }
}