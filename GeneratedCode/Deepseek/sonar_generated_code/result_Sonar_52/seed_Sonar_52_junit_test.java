import org.junit.jupiter.api.Test;

class MyJunit5Test {
  @Test
  void test() { /*... */ }

  class InnerClassTest { // BUG: JUnit5 inner test classes should be annotated with @Nested
    @Test
    void test() { /*... */ }
  }

  @Nested
  static class StaticNestedClassTest { // BUG: JUnit5 inner test classes should be annotated with @Nested
    @Test
    void test() { /*... */ }
  }

  public void showBug() {
    InnerClassTest inner = new InnerClassTest();
    inner.test();

    StaticNestedClassTest staticNested = new StaticNestedClassTest();
    staticNested.test();
  }
}