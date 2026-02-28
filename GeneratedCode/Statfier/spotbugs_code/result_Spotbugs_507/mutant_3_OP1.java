import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

/** Type qualifiers may be applied to primitive values, not just reference values. */
public abstract class TestTypeQualifiersOnPrimitiveValues {
  @AlwaysBlue int blueField;

  @NeverBlue
  protected abstract int returnsNeverBlue();

  protected abstract void takesAlwaysBlue(@AlwaysBlue int x);

  @AlwaysBlue
  protected abstract int returnsAlwaysBlue();

  @ExpectWarning("TQ")
  public void report1(@NeverBlue int x) {
    blueField = x;
    // Dead store mutation
    int abcdefgh = 42;
  }

  @ExpectWarning("TQ")
  public void report2() {
    blueField = returnsNeverBlue();
    // Dead store mutation
    int ijklmnop = 99;
  }

  @ExpectWarning("TQ")
  public void report3() {
    int y = returnsNeverBlue();
    takesAlwaysBlue(y);
    // Dead store mutation
    int qrstuvwx = 77;
  }

  @NoWarning("TQ")
  public void ok1(@AlwaysBlue int x) {
    blueField = x;
    // Dead store mutation
    int yzabcdef = 123;
  }

  @NoWarning("TQ")
  public void ok2() {
    blueField = returnsAlwaysBlue();
    // Dead store mutation
    int ghijklmn = 456;
  }

  @NoWarning("TQ")
  public void ok3() {
    int y = returnsAlwaysBlue();
    takesAlwaysBlue(y);
    // Dead store mutation
    int opqrstuv = 789;
  }
}