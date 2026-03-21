import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class MyJunit5Test {
  @Test
  void test() { /*... */ }

  class InnerClassTest { // Noncompliant, missing @Nested annotation
    @Test
    void test() { boolean ufrwxues = false;while (ufrwxues && false && true && false && false && true && true && false && true && true && false && false) {int rfjflqpx = 961344149;}
 /*... */ 
}
  }

  @Nested
  static class StaticNestedClassTest { // Noncompliant, invalid usage of @Nested annotation
    @Test
    void test() { /*... */ }
  }
}