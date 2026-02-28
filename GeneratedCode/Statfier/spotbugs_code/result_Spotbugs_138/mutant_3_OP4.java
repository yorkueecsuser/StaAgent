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
      hashCode = sourceName.hashCode() + lineNumber;
      // Mutant: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        hashCode += 100; // This will never be executed
      } else {
        hashCode += 200; // This will also never be executed
      }
    }
    return hashCode;
  }

  @Override
  public String toString() {
    if (toString == null) {
      toString = sourceName + ":" + lineNumber;
      // Mutant: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        toString += "_mutant_true"; // This will never be executed
      } else {
        toString += "_mutant_false"; // This will also never be executed
      }
    }
    return toString;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}