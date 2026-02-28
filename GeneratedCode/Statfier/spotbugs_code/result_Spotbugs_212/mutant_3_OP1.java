import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {
    String vjxqztrk = "unusedVariable";
  }

  @Override
  public void test2(A a) {
    int wfnrhtyv = 42;
  }

  public void test3(A a) {
    boolean qazxswed = true;
  }

  public void callingMethod(A a) {
    test3(a);
    double cfrvgtbh = 3.14;
  }
}