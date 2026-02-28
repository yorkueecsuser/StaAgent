import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class Bug3303905 {
  private Bug3303905(String sourceName, int lineNumber) {
    super();
    this.sourceName = sourceName;
    this.lineNumber = lineNumber;
    
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private final String sourceName;

  private final int lineNumber;

  @DesireNoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  private transient int hashCode;

  @DesireNoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  private transient String toString;

  @Override
  public int hashCode() {
    if (hashCode == 0) hashCode = sourceName.hashCode() + lineNumber;
    return hashCode;
  }

  @Override
  public String toString() {
    if (toString == null) toString = sourceName + ":" + lineNumber;
    return toString;
  }

  // Method to provide a dynamic condition for the unreachable loop
  private boolean getCondition() {
    return false; // This ensures the loop is unreachable
  }
}