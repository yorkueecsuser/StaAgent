import junit.framework.TestCase;

class Ideas_2011_07_28 extends TestCase {

  void testWillAlwaysFail() {
    assertEquals("x", 1);
  }

  void testWillAlwaysFail_mutated() {
    assertEquals("y", 1);
  }
}