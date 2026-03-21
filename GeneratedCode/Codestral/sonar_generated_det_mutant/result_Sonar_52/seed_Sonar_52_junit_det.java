// noncompliant code example
import org.junit.jupiter.api.Test;

class MyJunit5Test {
  @Test
  void test() {
    System.out.println("Outer test");
  }

  class InnerClassTest { // Noncompliant, missing @Nested annotation
    @Test
    void test() {
      System.out.println("Inner test");
    }
  }

  public void showBug() {
    // This method does not trigger the inner test case to run
    new MyJunit5Test().test();
  }
}