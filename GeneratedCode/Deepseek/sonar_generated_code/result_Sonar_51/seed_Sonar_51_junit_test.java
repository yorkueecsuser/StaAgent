import org.junit.jupiter.api.Test;

class MyClassTest {
  @Test
  private void test1() { // Noncompliant - ignored by JUnit5
    //...
    // BUG: JUnit5 test classes and methods should not be silently ignored
  }
  @Test
  static void test2() { // Noncompliant - ignored by JUnit5
    //...
    // BUG: JUnit5 test classes and methods should not be silently ignored
  }
  @Test
  boolean test3() { // Noncompliant - ignored by JUnit5
    //...
    // BUG: JUnit5 test classes and methods should not be silently ignored
  }
  @Nested
  private class MyNestedClass { // Noncompliant - ignored by JUnit5
    @Test
    void test() {
      //...
      // BUG: JUnit5 test classes and methods should not be silently ignored
    }
  }
}