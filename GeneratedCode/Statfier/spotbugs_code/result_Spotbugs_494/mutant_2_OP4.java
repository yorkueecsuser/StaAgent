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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      this.bytes = new byte[0];
    } else {
      // Alternative unreachable code block
      this.bytes = new byte[1];
    }
  }

  public void setBytesAfterCheck(byte[] bytes) {
    this.bytes = Objects.requireNonNull(bytes);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      this.bytes = new byte[0];
    } else {
      // Alternative unreachable code block
      this.bytes = new byte[1];
    }
  }

  public void setBytesAfterCheckWithGuava(byte[] bytes) {
    this.bytes = Preconditions.checkNotNull(bytes);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      this.bytes = new byte[0];
    } else {
      // Alternative unreachable code block
      this.bytes = new byte[1];
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}