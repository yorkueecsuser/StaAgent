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

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  void viaStringBuilderBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    InferTaint.inferSensitiveSink(builder.append(source).append("").toString());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder.append("More unreachable code");
    }
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(source);
    InferTaint.inferSensitiveSink(builder.toString());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder.append("Even more unreachable code");
    }
  }

  void viaStringBufferBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    InferTaint.inferSensitiveSink(buffer.append("").append(source).toString());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      buffer.append("Unreachable append");
    }
  }

  void viaStringBufferIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source);
    InferTaint.inferSensitiveSink(buffer.toString());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      buffer.append("Another unreachable append");
    }
  }

  void viaFormatterBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    InferTaint.inferSensitiveSink(formatter.format("%s", source).toString());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      formatter.format("%s", "Unreachable format");
    }
  }

  void viaFormatterIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    formatter.format("%s", source);
    InferTaint.inferSensitiveSink(formatter.toString());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      formatter.format("%s", "Yet another unreachable format");
    }
  }

  void viaStringFormatVarArgsDirectBad() {
    Object source = InferTaint.inferSecretSource();
    String tainted = String.format("%s%s", "hi", source);
    InferTaint.inferSensitiveSink(tainted);

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      String.format("%s", "Unreachable string format");
    }
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String tainted = String.format("%s%s", "hi", param);
    InferTaint.inferSensitiveSink(tainted);

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      String.format("%s", "More unreachable string format");
    }
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      String.format("%s", "Even more unreachable string format");
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true in a real scenario
  }
}