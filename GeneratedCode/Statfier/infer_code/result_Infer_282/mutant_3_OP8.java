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
    Object a = InferTaint.inferSecretSource();
    StringBuilder b = new StringBuilder();
    InferTaint.inferSensitiveSink(b.append(a).append("").toString());
  }

  void viaStringBuilderIgnoreReturnBad() {
    Object c = InferTaint.inferSecretSource();
    StringBuilder d = new StringBuilder();
    // builder should be tainted after this call even though we ignore the return value
    d.append(c);
    InferTaint.inferSensitiveSink(d.toString());
  }

  void viaStringBufferBad() {
    Object e = InferTaint.inferSecretSource();
    StringBuffer f = new StringBuffer();
    InferTaint.inferSensitiveSink(f.append("").append(e).toString());
  }

  void viaStringBufferIgnoreReturnBad() {
    Object g = InferTaint.inferSecretSource();
    StringBuffer h = new StringBuffer();
    h.append(g);
    InferTaint.inferSensitiveSink(h.toString());
  }

  void viaFormatterBad() {
    Object i = InferTaint.inferSecretSource();
    Formatter j = new Formatter();
    InferTaint.inferSensitiveSink(j.format("%s", i).toString());
  }

  void viaFormatterIgnoreReturnBad() {
    Object k = InferTaint.inferSecretSource();
    Formatter l = new Formatter();
    l.format("%s", k);
    InferTaint.inferSensitiveSink(l.toString());
  }

  void viaStringFormatVarArgsDirectBad() {
    Object m = InferTaint.inferSecretSource();
    String n = String.format("%s%s", "hi", m);
    InferTaint.inferSensitiveSink(n);
  }

  void viaStringFormatVarArgsIndirect(Object o) {
    String p = String.format("%s%s", "hi", o);
    InferTaint.inferSensitiveSink(p);
  }

  void viaStringFormatVarArgsIndirectBad() {
    viaStringFormatVarArgsIndirect(InferTaint.inferSecretSource());
  }
}