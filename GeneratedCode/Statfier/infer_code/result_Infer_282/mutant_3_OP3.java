import codetoanalyze.java.InferTaint;
import java.util.Formatter;

/**
 * a lot of tainted values are strings, so propagation through StringBuilder's and the like is very
 * important.
 */
class Strings {

  void viaStringBuilderSugarBad() {
    Object source = InferTaint.inferSecretSource();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(source + "");
  }

  void viaStringBuilderBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(builder.append(source).append("").toString());
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(source);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(builder.toString());
  }

  void viaStringBufferBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(buffer.append("").append(source).toString());
  }

  void viaStringBufferIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(buffer.toString());
  }

  void viaFormatterBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(formatter.format("%s", source).toString());
  }

  void viaFormatterIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    formatter.format("%s", source);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(formatter.toString());
  }

  void viaStringFormatVarArgsDirectBad() {
    Object source = InferTaint.inferSecretSource();
    String tainted = String.format("%s%s", "hi", source);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String tainted = String.format("%s%s", "hi", param);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if branches unreachable
  }
}