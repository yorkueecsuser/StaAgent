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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringBuilderBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    InferTaint.inferSensitiveSink(builder.append(source).append("").toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(source);
    InferTaint.inferSensitiveSink(builder.toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringBufferBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    InferTaint.inferSensitiveSink(buffer.append("").append(source).toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringBufferIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source);
    InferTaint.inferSensitiveSink(buffer.toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaFormatterBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    InferTaint.inferSensitiveSink(formatter.format("%s", source).toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaFormatterIgnoreReturnBad() {
    Object source = InferTaint.inferSecretSource();
    Formatter formatter = new Formatter();
    formatter.format("%s", source);
    InferTaint.inferSensitiveSink(formatter.toString());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringFormatVarArgsDirectBad() {
    Object source = InferTaint.inferSecretSource();
    String tainted = String.format("%s%s", "hi", source);
    InferTaint.inferSensitiveSink(tainted);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String tainted = String.format("%s%s", "hi", param);
    InferTaint.inferSensitiveSink(tainted);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}