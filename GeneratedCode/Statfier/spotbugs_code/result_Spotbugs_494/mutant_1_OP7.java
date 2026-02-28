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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void setBytesAfterCheck(byte[] bytes) {
    this.bytes = Objects.requireNonNull(bytes);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void setBytesAfterCheckWithGuava(byte[] bytes) {
    this.bytes = Preconditions.checkNotNull(bytes);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}