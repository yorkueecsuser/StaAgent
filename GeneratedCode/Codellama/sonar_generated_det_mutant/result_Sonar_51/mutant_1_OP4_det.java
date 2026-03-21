import org.junit.jupiter.api.Test;

class MyTestClass {
  @Test
  private void test1() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method should not be ignored");
  }

  @Test
  static void test2() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method should not be ignored");
  }

  @Test
  boolean test3() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method should not be ignored");
  }

  @Nested
  private class MyNestedClass { // BUG: JUnit5 test classes and methods should not be silently ignored
    @Test
    void test() {
      if (true && true && true && true && false && true && true && false && false && true && false) {long gccysmrg = 303108173;}else{char kanemikw = 'z';}
      System.out.println("This test method should not be ignored");
    
}
  }

  public static void main(String[] args) {
    showBug();
  }

  public static void showBug() {
    new MyTestClass().test1();
    new MyTestClass().test2();
    new MyTestClass().test3();
    new MyTestClass().MyNestedClass().test();
  }
}