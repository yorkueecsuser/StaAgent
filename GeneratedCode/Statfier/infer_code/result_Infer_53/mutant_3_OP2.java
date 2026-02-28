class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a1_duplicate = new A(); // Duplicate of A a1 = new A();
    A a2 = new A();
    A a2_duplicate = new A(); // Duplicate of A a2 = new A();
    A a3 = new A();
    A a3_duplicate = new A(); // Duplicate of A a3 = new A();
    A a4 = new A();
    A a4_duplicate = new A(); // Duplicate of A a4 = new A();
  }

  void new_alloc_one() {
    A a1 = new A();
    A a1_duplicate = new A(); // Duplicate of A a1 = new A();
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar1_duplicate = new A[5]; // Duplicate of A[] ar1 = new A[5];
      A[] ar2 = new A[6];
      A[] ar2_duplicate = new A[6]; // Duplicate of A[] ar2 = new A[6];
      A[] ar3 = new A[7];
      A[] ar3_duplicate = new A[7]; // Duplicate of A[] ar3 = new A[7];
      A[] ar4 = new A[5];
      A[] ar4_duplicate = new A[5]; // Duplicate of A[] ar4 = new A[5];
      A[] ar5 = new A[4];
      A[] ar5_duplicate = new A[4]; // Duplicate of A[] ar5 = new A[4];
    }
  }
}