import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ExampleDemo {

  @Test
  private void method1() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method is private and will be ignored by JUnit5.");
  }

  @Test
  static void method2() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method is static and will be ignored by JUnit5.");
  }

  @Test
  boolean method3() { // BUG: JUnit5 test classes and methods should not be silently ignored
    System.out.println("This test method returns a value and will be ignored by JUnit5.");
    return true;
  }

  @Nested
  private class NestedClass { // BUG: JUnit5 test classes and methods should not be silently ignored
    @Test
    void nestedMethod() {
      System.out.println("This nested test method is inside a private class and will be ignored by JUnit5.");
    }
  }

  public String showBug() {
    method1();
    method2();
    method3();
    new NestedClass().nestedMethod();
    return "Check console for ignored test messages.";
  }
}