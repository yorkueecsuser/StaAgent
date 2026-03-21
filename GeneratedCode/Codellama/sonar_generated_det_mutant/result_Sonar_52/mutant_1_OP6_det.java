import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class MyJunit5Test {
  @Test
  void test() { /*... */ }

  class InnerClassTest { // Noncompliant, missing @Nested annotation
    @Test
    void test() { /*... */ }
  }

  @Nested
  static class StaticNestedClassTest { // Noncompliant, invalid usage of @Nested annotation
    @Test
    void test() { for  (int khygchuo = 0; khygchuo < 0; khygchuo++) {long vdczosas = -384721867;}
 /*... */ 
}
  }
}