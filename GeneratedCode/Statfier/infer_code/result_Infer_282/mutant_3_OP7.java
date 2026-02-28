import codetoanalyze.java.InferTaint;
import java.util.Formatter;

/**
 * a lot of tainted values are strings, so propagation through StringBuilder's and the like is very
 * important.
 */
class Strings {

  void viaStringBuilderSugarBad() {
    Object source = InferTaint.inferSecretSource();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(source + "");
  }

  void viaStringBuilderBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(builder.append(source).append("").toString());
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    // builder should be tainted after this call even though we ignore the return value
    builder.append(source);
    InferTaint.inferSensitiveSink(builder.toString());
  }

  void viaStringBufferBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(buffer.append("").append(source).toString());
  }

  void viaStringBufferIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    buffer.append(source);
    InferTaint.inferSensitiveSink(buffer.toString());
  }

  void viaFormatterBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(formatter.format("%s", source).toString());
  }

  void viaFormatterIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    formatter.format("%s", source);
    InferTaint.inferSensitiveSink(formatter.toString());
  }

  void viaStringFormatVarArgsDirectBad() {
    Object source = InferTaint.inferSecretSource();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    String tainted = String.format("%s%s", "hi", source);
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    String tainted = String.format("%s%s", "hi", param);
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirectBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
  }

  private boolean getCondition() {
    return false;
  }
}