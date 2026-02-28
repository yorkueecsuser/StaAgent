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
  }

  void viaStringBuilderBad() {
    Object x = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 'x'
    StringBuilder builder = new StringBuilder();
    InferTaint.inferSensitiveSink(builder.append(x).append("").toString());
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object y = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 'y'
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(y);
    InferTaint.inferSensitiveSink(builder.toString());
  }

  void viaStringBufferBad() {
    Object z = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 'z'
    StringBuffer buffer = new StringBuffer();
    InferTaint.inferSensitiveSink(buffer.append("").append(z).toString());
  }

  void viaStringBufferIgnoreReturnBad() {
    Object w = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 'w'
    StringBuffer buffer = new StringBuffer();
    buffer.append(w);
    InferTaint.inferSensitiveSink(buffer.toString());
  }

  void viaFormatterBad() {
    Object v = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 'v'
    Formatter formatter = new Formatter();
    InferTaint.inferSensitiveSink(formatter.format("%s", v).toString());
  }

  void viaFormatterIgnoreReturnBad() {
    Object u = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 'u'
    Formatter formatter = new Formatter();
    formatter.format("%s", u);
    InferTaint.inferSensitiveSink(formatter.toString());
  }

  void viaStringFormatVarArgsDirectBad() {
    Object t = InferTaint.inferSecretSource(); // Mutated variable name from'source' to 't'
    String tainted = String.format("%s%s", "hi", t);
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String s = String.format("%s%s", "hi", param); // Mutated variable name from 'tainted' to's'
    InferTaint.inferSensitiveSink(s);
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
  }
}