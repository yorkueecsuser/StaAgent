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
    // Dead store mutation
    String xqjvbnrt = "unusedVariable";
  }

  public void setBytesAfterCheck(byte[] bytes) {
    this.bytes = Objects.requireNonNull(bytes);
    // Dead store mutation
    int mnbvcxza = 42;
  }

  public void setBytesAfterCheckWithGuava(byte[] bytes) {
    this.bytes = Preconditions.checkNotNull(bytes);
    // Dead store mutation
    boolean lkjhgfds = true;
  }
}