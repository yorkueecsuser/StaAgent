import codetoanalyze.java.InferTaint;
import java.util.Formatter;

/**
 * a lot of tainted values are strings, so propagation through StringBuilder's and the like is very
 * important.
 */
class Strings {

  void viaStringBuilderSugarBad() {
    Object source = InferTaint.inferSecretSource();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(source + "");
  }

  void viaStringBuilderBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(builder.append(source).append("").toString());
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(source);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(builder.toString());
  }

  void viaStringBufferBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(buffer.append("").append(source).toString());
  }

  void viaStringBufferIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(buffer.toString());
  }

  void viaFormatterBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(formatter.format("%s", source).toString());
  }

  void viaFormatterIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    formatter.format("%s", source);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(formatter.toString());
  }

  void viaStringFormatVarArgsDirectBad() {
    Object source = InferTaint.inferSecretSource();
    String tainted = String.format("%s%s", "hi", source);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String tainted = String.format("%s%s", "hi", param);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that also should never execute
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the blocks are unreachable
  }
}