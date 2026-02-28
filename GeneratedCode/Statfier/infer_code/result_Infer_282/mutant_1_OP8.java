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
    Object x = InferTaint.inferSecretSource(); // Renamed'source' to 'x'
    StringBuilder builder = new StringBuilder();
    InferTaint.inferSensitiveSink(builder.append(x).append("").toString());
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object y = InferTaint.inferSecretSource(); // Renamed'source' to 'y'
    StringBuilder builder = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    builder.append(y);
    InferTaint.inferSensitiveSink(builder.toString());
  }

  void viaStringBufferBad() {
    Object z = InferTaint.inferSecretSource(); // Renamed'source' to 'z'
    StringBuffer buffer = new StringBuffer();
    InferTaint.inferSensitiveSink(buffer.append("").append(z).toString());
  }

  void viaStringBufferIgnoreReturnBad() {
    Object a = InferTaint.inferSecretSource(); // Renamed'source' to 'a'
    StringBuffer buffer = new StringBuffer();
    buffer.append(a);
    InferTaint.inferSensitiveSink(buffer.toString());
  }

  void viaFormatterBad() {
    Object b = InferTaint.inferSecretSource(); // Renamed'source' to 'b'
    Formatter formatter = new Formatter();
    InferTaint.inferSensitiveSink(formatter.format("%s", b).toString());
  }

  void viaFormatterIgnoreReturnBad() {
    Object c = InferTaint.inferSecretSource(); // Renamed'source' to 'c'
    Formatter formatter = new Formatter();
    formatter.format("%s", c);
    InferTaint.inferSensitiveSink(formatter.toString());
  }

  void viaStringFormatVarArgsDirectBad() {
    Object d = InferTaint.inferSecretSource(); // Renamed'source' to 'd'
    String tainted = String.format("%s%s", "hi", d);
    InferTaint.inferSensitiveSink(tainted);
  }

  void viaStringFormatVarArgsIndirect(Object param) {
    String e = String.format("%s%s", "hi", param); // Renamed 'tainted' to 'e'
    InferTaint.inferSensitiveSink(e);
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
  }
}