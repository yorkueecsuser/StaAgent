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
    void test() { for  (int clupvwbl = 0; clupvwbl < 0; clupvwbl++) {double ygpjrcpy = -742163904;}
 /*... */ 
}
  }
}