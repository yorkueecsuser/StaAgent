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

  // Mutated code
  private final String a; // Renamed from sourceName to a
  private final int b; // Renamed from lineNumber to b

  private transient int c; // Renamed from hashCode to c
  private transient String d; // Renamed from toString to d

  private int e() { // Renamed from hashCode method to e
    if (c == 0) c = a.hashCode() + b;
    return c;
  }

  private String f() { // Renamed from toString method to f
    if (d == null) d = a + ":" + b;
    return d;
  }
}