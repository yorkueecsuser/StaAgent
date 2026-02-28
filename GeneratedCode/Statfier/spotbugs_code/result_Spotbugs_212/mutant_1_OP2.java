import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {
    int x = 5; // Introduced assignment for demonstration
    int x = 5; // Duplicated assignment
  }

  @Override
  public void test2(A a) {}

  public void test3(A a) {}

  public void callingMethod(A a) {
    test3(a);
  }
}