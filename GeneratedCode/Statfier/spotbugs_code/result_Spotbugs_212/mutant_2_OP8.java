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
  public void test2(C c) {}

  public void test3(D d) {}

  public void callingMethod(E e) {
    test3(e);
  }
}