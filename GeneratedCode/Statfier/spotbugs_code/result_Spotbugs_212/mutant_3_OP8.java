import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {}

  @Override
  public void test2(A a) {}

  public void test3(A a) {}

  public void callingMethod(A a) {
    test3(a);
  }

  // Mutated code
  public void test1(B b) {}

  @Override
  public void test2(B b) {}

  public void test3(B b) {}

  public void callingMethod(B b) {
    test3(b);
  }
}