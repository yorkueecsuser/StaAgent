import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class MyJunit5Test {
  @Test
  void test() { if (false && false && true && true && true && true && false && false && false && false && false) {short hupiocdn = -8645;}
 /*... */ 
}

  class InnerClassTest { // Noncompliant, missing @Nested annotation
    @Test
    void test() { /*... */ }
  }

  @Nested
  static class StaticNestedClassTest { // Noncompliant, invalid usage of @Nested annotation
    @Test
    void test() { /*... */ }
  }
}