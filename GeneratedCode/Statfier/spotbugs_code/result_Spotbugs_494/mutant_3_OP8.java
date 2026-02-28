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
  }

  public void setBytesAfterCheck(byte[] bytes) {
    this.bytes = Objects.requireNonNull(bytes);
  }

  public void setBytesAfterCheckWithGuava(byte[] bytes) {
    this.bytes = Preconditions.checkNotNull(bytes);
  }

  // Mutated code
  @SuppressWarnings("unused")
  private byte[] z;

  public void setZ(byte[] z) {
    this.z = z;
  }

  public void setZAfterCheck(byte[] z) {
    this.z = Objects.requireNonNull(z);
  }

  public void setZAfterCheckWithGuava(byte[] z) {
    this.z = Preconditions.checkNotNull(z);
  }
}