import com.google.common.base.Preconditions;
import java.util.Objects;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/603">GitHub issue</a>
 */
class Issue603 {
  @SuppressWarnings("unused")
  private byte[] bytes;

  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is an unreachable block.");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block.");
    }
  }

  public void setBytesAfterCheck(byte[] bytes) {
    this.bytes = Objects.requireNonNull(bytes);
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is an unreachable block.");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block.");
    }
  }

  public void setBytesAfterCheckWithGuava(byte[] bytes) {
    this.bytes = Preconditions.checkNotNull(bytes);
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is an unreachable block.");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block.");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else branches are unreachable
    return false;
  }
}