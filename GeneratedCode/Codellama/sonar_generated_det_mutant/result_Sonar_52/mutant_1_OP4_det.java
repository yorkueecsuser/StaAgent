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
    void test() { if (false && true && false && false && false && true && false && true && false && false && false) {short gjxdhlns = 9252;}else{boolean pltjfbby = false;}
 /*... */ 
}
  }
}