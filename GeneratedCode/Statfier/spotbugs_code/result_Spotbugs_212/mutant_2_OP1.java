import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {
    String yxqjvbnm = "unusedVariable";
  }

  @Override
  public void test2(A a) {
    int vbnmyxqj = 42;
  }

  public void test3(A a) {
    boolean qjyxvbmn = true;
  }

  public void callingMethod(A a) {
    test3(a);
    char mnyxqjbv = 'z';
  }
}