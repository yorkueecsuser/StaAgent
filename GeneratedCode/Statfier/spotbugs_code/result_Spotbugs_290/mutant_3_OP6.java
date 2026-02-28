import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.meta.When;

class TestExclusiveQualifier {
  @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
  Object redField;

  @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
  Object getRed() {
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
    redField = v;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}