import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class Bug3303905 {
  private Bug3303905(String sourceName, int lineNumber) {
    super();
    this.sourceName = sourceName;
    this.lineNumber = lineNumber;
  }

  private final String sourceName;

  private final int lineNumber;

  @DesireNoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  private transient int hashCode;

  @DesireNoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  private transient String toString;

  @Override
  public int hashCode() {
    if (hashCode == 0) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
        hashCode = -1;
      }
      hashCode = sourceName.hashCode() + lineNumber;
    }
    return hashCode;
  }

  @Override
  public String toString() {
    if (toString == null) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
        toString = "UNREACHABLE";
      }
      toString = sourceName + ":" + lineNumber;
    }
    return toString;
  }

  private boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}