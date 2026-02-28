import codetoanalyze.java.InferTaint;
import java.util.Formatter;

/**
 * a lot of tainted values are strings, so propagation through StringBuilder's and the like is very
 * important.
 */
class Strings {

  void viaStringBuilderSugarBad() {
    Object source = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(source + "");
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringBuilderBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    InferTaint.inferSensitiveSink(builder.append(source).append("").toString());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(source);
    InferTaint.inferSensitiveSink(builder.toString());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringBufferBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    InferTaint.inferSensitiveSink(buffer.append("").append(source).toString());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringBufferIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source);
    InferTaint.inferSensitiveSink(buffer.toString());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaFormatterBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    InferTaint.inferSensitiveSink(formatter.format("%s", source).toString());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaFormatterIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    formatter.format("%s", source);
    InferTaint.inferSensitiveSink(formatter.toString());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringFormatVarArgsDirectBad() {
    Object source = InferTaint.inferSecretSource();
    String tainted = String.format("%s%s", "hi", source);
    InferTaint.inferSensitiveSink(tainted);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String tainted = String.format("%s%s", "hi", param);
    InferTaint.inferSensitiveSink(tainted);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}