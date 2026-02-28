class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();
    
    // Mutant
    A b1 = new A();
    A c2 = new A();
    A d3 = new A();
    A e4 = new A();
  }

  void new_alloc_one() {
    A a1 = new A();
    
    // Mutant
    A f1 = new A();
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar2 = new A[6];
      A[] ar3 = new A[7];
      A[] ar4 = new A[5];
      A[] ar5 = new A[4];
      
      // Mutant
      A[] br1 = new A[5];
      A[] cr2 = new A[6];
      A[] dr3 = new A[7];
      A[] er4 = new A[5];
      A[] fr5 = new A[4];
    }
  }
}