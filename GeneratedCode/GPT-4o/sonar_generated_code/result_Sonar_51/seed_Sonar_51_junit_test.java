import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class ExampleTest {

  @Test
  private void testPrivateMethod() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This is a private test method and will be ignored.");
  }

  @Test
  static void testStaticMethod() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This is a static test method and will be ignored.");
  }

  @Test
  boolean testReturningValue() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method returns a boolean and will be ignored.");
    return true;
  }

  @Nested
  private class IgnoredNestedClass { // BUG: JUnit5 test classes and methods should not be silently ignored
    @Test
    void testInNestedClass() {
      System.out.println("This is a test method inside a private nested class and will be ignored.");
    }
  }

  public void showBug() {
    System.out.println("Demonstrating JUnit5 test method ignoring due to visibility and return type issues.");
    testPrivateMethod();
    testStaticMethod();
    testReturningValue();
    IgnoredNestedClass nested = new IgnoredNestedClass();
    nested.testInNestedClass();
  }
}