import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {
    String jxqfvtbw = "unused"; // Dead store
  }

  @Override
  public void test2(A a) {
    int rjvhtyuz = 42; // Dead store
  }

  public void test3(A a) {
    boolean kldfghij = true; // Dead store
  }

  public void callingMethod(A a) {
    test3(a);
    char zxcvbnml = 'x'; // Dead store
  }
}