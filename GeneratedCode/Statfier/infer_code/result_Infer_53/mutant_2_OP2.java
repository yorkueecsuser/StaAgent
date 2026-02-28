class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a1_duplicate = new A(); // Mutant: duplicated assignment
    A a2 = new A();
    A a2_duplicate = new A(); // Mutant: duplicated assignment
    A a3 = new A();
    A a3_duplicate = new A(); // Mutant: duplicated assignment
    A a4 = new A();
    A a4_duplicate = new A(); // Mutant: duplicated assignment
  }

  void new_alloc_one() {
    A a1 = new A();
    A a1_duplicate = new A(); // Mutant: duplicated assignment
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar1_duplicate = new A[5]; // Mutant: duplicated assignment
      A[] ar2 = new A[6];
      A[] ar2_duplicate = new A[6]; // Mutant: duplicated assignment
      A[] ar3 = new A[7];
      A[] ar3_duplicate = new A[7]; // Mutant: duplicated assignment
      A[] ar4 = new A[5];
      A[] ar4_duplicate = new A[5]; // Mutant: duplicated assignment
      A[] ar5 = new A[4];
      A[] ar5_duplicate = new A[4]; // Mutant: duplicated assignment
    }
  }
}