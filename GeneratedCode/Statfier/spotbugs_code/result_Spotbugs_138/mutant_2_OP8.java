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
    if (hashCode == 0) hashCode = sourceName.hashCode() + lineNumber;
    return hashCode;
  }

  @Override
  public String toString() {
    if (toString == null) toString = sourceName + ":" + lineNumber;
    return toString;
  }

  // Mutant code with renamed variable
  private final String q;
  private final int x;

  private Bug3303905(String q, int x) {
    super();
    this.q = q;
    this.x = x;
  }

  @Override
  public int x() {
    if (hashCode == 0) hashCode = q.hashCode() + x;
    return hashCode;
  }

  @Override
  public String q() {
    if (toString == null) toString = q + ":" + x;
    return toString;
  }
}