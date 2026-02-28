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
      // This block will never execute because getCondition() always returns false
      this.bytes = new byte[0];
    } else {
      // This block will always execute
      this.bytes = bytes;
    }
  }

  public void setBytesAfterCheck(byte[] bytes) {
    this.bytes = Objects.requireNonNull(bytes);
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      this.bytes = new byte[0];
    } else {
      // This block will always execute
      this.bytes = bytes;
    }
  }

  public void setBytesAfterCheckWithGuava(byte[] bytes) {
    this.bytes = Preconditions.checkNotNull(bytes);
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      this.bytes = new byte[0];
    } else {
      // This block will always execute
      this.bytes = bytes;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branch is unreachable
  }
}