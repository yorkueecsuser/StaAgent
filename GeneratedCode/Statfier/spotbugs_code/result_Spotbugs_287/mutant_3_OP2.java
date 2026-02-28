import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import junit.framework.Assert;

class Ideas_2011_11_25 {

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo(String x) {
    Assert.assertNotNull(x, "x must be nonnull");
    Assert.assertNotNull(x, "x must be nonnull"); // Mutant: duplicated the assertion statement
  }

  @ExpectWarning("DMI_DOH")
  public void foo2(String x) {
    Assert.assertNotNull("x must be nonnull");
    Assert.assertNotNull("x must be nonnull"); // Mutant: duplicated the assertion statement
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo3(String x) {
    Assert.assertNotNull("x must be nonnull", x);
    Assert.assertNotNull("x must be nonnull", x); // Mutant: duplicated the assertion statement
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar(String x) {
    Preconditions.checkNotNull("x must be nonnull", x);
    Preconditions.checkNotNull("x must be nonnull", x); // Mutant: duplicated the checkNotNull statement
  }

  @ExpectWarning("DMI_DOH")
  public void bar2(String x) {
    Preconditions.checkNotNull("x must be nonnull");
    Preconditions.checkNotNull("x must be nonnull"); // Mutant: duplicated the checkNotNull statement
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar3(String x) {
    Preconditions.checkNotNull(x, "x must be nonnull");
    Preconditions.checkNotNull(x, "x must be nonnull"); // Mutant: duplicated the checkNotNull statement
  }
}