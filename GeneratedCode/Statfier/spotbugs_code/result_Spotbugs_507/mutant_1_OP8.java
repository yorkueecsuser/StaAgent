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
  }

  @ExpectWarning("TQ")
  public void report2() {
    blueField = returnsNeverBlue();
  }

  @ExpectWarning("TQ")
  public void report3() {
    int y = returnsNeverBlue();
    takesAlwaysBlue(y);
  }

  @NoWarning("TQ")
  public void ok1(@AlwaysBlue int x) {
    blueField = x;
  }

  @NoWarning("TQ")
  public void ok2() {
    blueField = returnsAlwaysBlue();
  }

  @NoWarning("TQ")
  public void ok3() {
    int y = returnsAlwaysBlue();
    takesAlwaysBlue(y);
  }

  // Mutant 1: Renaming variable 'y' in report3 to 'a'
  @ExpectWarning("TQ")
  public void report3_mutant1() {
    int a = returnsNeverBlue();
    takesAlwaysBlue(a);
  }

  // Mutant 2: Renaming variable 'y' in ok3 to 'b'
  @NoWarning("TQ")
  public void ok3_mutant2() {
    int b = returnsAlwaysBlue();
    takesAlwaysBlue(b);
  }
}