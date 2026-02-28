import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import junit.framework.Assert;

class Ideas_2011_11_25 {

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo(String x) {
    Assert.assertNotNull(x, "x must be nonnull");
  }

  @ExpectWarning("DMI_DOH")
  public void foo2(String x) {
    Assert.assertNotNull("x must be nonnull");
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo3(String x) {
    Assert.assertNotNull("x must be nonnull", x);
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar(String x) {
    Preconditions.checkNotNull("x must be nonnull", x);
  }

  @ExpectWarning("DMI_DOH")
  public void bar2(String x) {
    Preconditions.checkNotNull("x must be nonnull");
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar3(String x) {
    Preconditions.checkNotNull(x, "x must be nonnull");
  }

  // Mutated methods with renamed variables

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo_a(String a) {
    Assert.assertNotNull(a, "a must be nonnull");
  }

  @ExpectWarning("DMI_DOH")
  public void foo2_b(String b) {
    Assert.assertNotNull("b must be nonnull");
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo3_c(String c) {
    Assert.assertNotNull("c must be nonnull", c);
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar_d(String d) {
    Preconditions.checkNotNull("d must be nonnull", d);
  }

  @ExpectWarning("DMI_DOH")
  public void bar2_e(String e) {
    Preconditions.checkNotNull("e must be nonnull");
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar3_f(String f) {
    Preconditions.checkNotNull(f, "f must be nonnull");
  }
}