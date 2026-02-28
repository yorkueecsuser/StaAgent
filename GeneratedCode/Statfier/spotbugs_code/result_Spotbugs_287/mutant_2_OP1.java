import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import junit.framework.Assert;

class Ideas_2011_11_25 {

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo(String x) {
    String jvbnrhty; // Dead store
    Assert.assertNotNull(x, "x must be nonnull");
  }

  @ExpectWarning("DMI_DOH")
  public void foo2(String x) {
    int klmnopqr; // Dead store
    Assert.assertNotNull("x must be nonnull");
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo3(String x) {
    boolean rstuvwxy; // Dead store
    Assert.assertNotNull("x must be nonnull", x);
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar(String x) {
    char yzabcd; // Dead store
    Preconditions.checkNotNull("x must be nonnull", x);
  }

  @ExpectWarning("DMI_DOH")
  public void bar2(String x) {
    float efghij; // Dead store
    Preconditions.checkNotNull("x must be nonnull");
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar3(String x) {
    double klmnop; // Dead store
    Preconditions.checkNotNull(x, "x must be nonnull");
  }
}