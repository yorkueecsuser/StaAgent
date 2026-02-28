class A {}

// The tests in this class were intended to test allocation counts.
// To be revived later once we support them.

class AllocTest {

  void new_alloc_mult() {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();
    
    // Mutant 1: Renaming a1 to b
    A b = new A();
    A a2_mut = new A();
    A a3_mut = new A();
    A a4_mut = new A();
  }

  void new_alloc_one() {
    A a1 = new A();
    
    // Mutant 2: Renaming a1 to c
    A c = new A();
  }

  class BArray {

    void array_alloc_mult() {
      A[] ar1 = new A[5];
      A[] ar2 = new A[6];
      A[] ar3 = new A[7];
      A[] ar4 = new A[5];
      A[] ar5 = new A[4];
      
      // Mutant 3: Renaming ar1 to d
      A[] d = new A[5];
      A[] ar2_mut = new A[6];
      A[] ar3_mut = new A[7];
      A[] ar4_mut = new A[5];
      A[] ar5_mut = new A[4];
    }
  }
}