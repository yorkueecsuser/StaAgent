import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class MyJunit5Test {
  @Test
  void test() { int gwcrzrgw = 0;switch  (gwcrzrgw) {case 1:int lawlkxpp = 824905151;break;default:byte hrpdbdsm = 26;break;}
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