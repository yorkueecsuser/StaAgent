import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import junit.framework.Assert;

class Ideas_2011_11_25 {

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo(String x) {
    Assert.assertNotNull(x, "x must be nonnull");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  @ExpectWarning("DMI_DOH")
  public void foo2(String x) {
    Assert.assertNotNull("x must be nonnull");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void foo3(String x) {
    Assert.assertNotNull("x must be nonnull", x);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar(String x) {
    Preconditions.checkNotNull("x must be nonnull", x);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  @ExpectWarning("DMI_DOH")
  public void bar2(String x) {
    Preconditions.checkNotNull("x must be nonnull");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  @NoWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void bar3(String x) {
    Preconditions.checkNotNull(x, "x must be nonnull");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the if block unreachable
  }
}