import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.meta.When;

class TestExclusiveQualifier {
  @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
  Object redField;

  @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
  Object getRed() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return redField;
  }

  void setRed(
      @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
          Object redField) {
    this.redField = redField;
  }

  @ExpectWarning("TQ")
  public void report1(
      @ExclusiveQualifier(value = ExclusiveQualifier.Color.BLUE, when = When.ALWAYS) Object v) {
    // always BLUE should imply never RED
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    redField = v;
  }

  private boolean getCondition() {
    return false;
  }
}