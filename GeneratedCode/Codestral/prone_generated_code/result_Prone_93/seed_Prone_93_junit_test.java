import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import org.junit.Assert;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  BuggyClass.class
})
class BuggyTestSuite {

  public static class BuggyClass {
    @Test
    public void testBuggyMethod() {
      Assert.assertTrue(false); // BUG: JUnit4TestsNotRunWithinEnclosed
    }
  }

  public static void showBug() {
    // This method should be called from an outside file to demonstrate the bug.
    // However, the test within BuggyClass will not run due to the @RunWith(Suite.class) annotation.
  }
}