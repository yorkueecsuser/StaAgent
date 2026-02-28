import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {
    int localVar = 0; // Introduced local variable for demonstration
    localVar = 1;     // Original assignment
    localVar = 1;     // Duplicated assignment
  }

  @Override
  public void test2(A a) {}

  public void test3(A a) {}

  public void callingMethod(A a) {
    test3(a);
  }
}