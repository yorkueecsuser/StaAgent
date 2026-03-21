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
    void test() { if (false && true && false && true && false && true && true && true && false && false && false) {float hcchosba = 216116787;}else{double ssohjinv = 288605280;}
 /*... */ 
}
  }
}