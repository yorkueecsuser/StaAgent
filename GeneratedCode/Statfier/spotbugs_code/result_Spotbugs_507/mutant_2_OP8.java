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

  // Mutated code
  @ExpectWarning("TQ")
  public void report1Mutant(@NeverBlue int a) {
    blueField = a;
  }

  @ExpectWarning("TQ")
  public void report2Mutant() {
    blueField = returnsNeverBlue();
  }

  @ExpectWarning("TQ")
  public void report3Mutant() {
    int z = returnsNeverBlue();
    takesAlwaysBlue(z);
  }

  @NoWarning("TQ")
  public void ok1Mutant(@AlwaysBlue int b) {
    blueField = b;
  }

  @NoWarning("TQ")
  public void ok2Mutant() {
    blueField = returnsAlwaysBlue();
  }

  @NoWarning("TQ")
  public void ok3Mutant() {
    int c = returnsAlwaysBlue();
    takesAlwaysBlue(c);
  }
}