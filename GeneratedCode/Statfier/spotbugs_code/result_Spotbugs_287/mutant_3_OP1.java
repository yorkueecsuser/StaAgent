import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import junit.framework.Assert;

class Ideas_2011_11_25 {

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo(String x) {
    Assert.assertNotNull(x, "x must be nonnull");
    String qwerasdf = "unused"; // Dead store
  }

  @ExpectWarning("DMI_DOH")
  public void foo2(String x) {
    Assert.assertNotNull("x must be nonnull");
    int zxcvbnmQ = 42; // Dead store
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo3(String x) {
    Assert.assertNotNull("x must be nonnull", x);
    boolean lkjhgfds = true; // Dead store
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar(String x) {
    Preconditions.checkNotNull("x must be nonnull", x);
    char poiuytrew = 'a'; // Dead store
  }

  @ExpectWarning("DMI_DOH")
  public void bar2(String x) {
    Preconditions.checkNotNull("x must be nonnull");
    double mnbgvfcd = 3.14; // Dead store
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar3(String x) {
    Preconditions.checkNotNull(x, "x must be nonnull");
    long asdfghjk = 123456789L; // Dead store
  }
}