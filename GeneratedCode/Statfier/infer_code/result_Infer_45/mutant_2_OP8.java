import android.content.Intent;
import android.os.Parcel;
import codetoanalyze.java.InferTaint;

/** testing how the analysis handles missing/unknown code */
public abstract class UnknownCode {

  static native Object nativeMethod(Object o);

  abstract Object abstractMethod(Object o);

  static interface Interface {
    Object interfaceMethod(Object o);
  }

  static void propagateViaUnknownConstructorBad() {
    String source = (String) InferTaint.inferSecretSource();
    // we don't analyze the code for the core Java libraries, so this constructor will be unknown
    String unknownConstructor = new String(source);
    InferTaint.inferSensitiveSink(unknownConstructor);
    // Mutant
    String x = new String(source);
    InferTaint.inferSensitiveSink(x);
  }

  static void propagateViaUnknownConstructorOk() {
    String unknownConstructor = new String("");
    InferTaint.inferSensitiveSink(unknownConstructor);
    // Mutant
    String y = new String("");
    InferTaint.inferSensitiveSink(y);
  }

  void propagateViaUnknownCodeOk(Interface i) {
    Object notASource = new Object();
    Object launderedSource1 = nativeMethod(notASource);
    Object launderedSource2 = abstractMethod(launderedSource1);
    Object launderedSource3 = i.interfaceMethod(launderedSource2);
    InferTaint.inferSensitiveSink(launderedSource3);
    // Mutant
    Object z = nativeMethod(notASource);
    InferTaint.inferSensitiveSink(z);
  }

  void callUnknownSetterBad(Intent i) {
    Object source = InferTaint.inferSecretSource();
    // we don't analyze the source code for Android, so this will be unknown
    i.writeToParcel((Parcel) source, 0);
    InferTaint.inferSensitiveSink(i);
    // Mutant
    Object w = InferTaint.inferSecretSource();
    i.writeToParcel((Parcel) w, 0);
    InferTaint.inferSensitiveSink(i);
  }

  void propagateEmptyBad() {
    String source = (String) InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source); // buffer is now tainted
    // even though "" is not tainted, buffer and alias should still be tainted
    StringBuffer alias = buffer.append("");
    InferTaint.inferSensitiveSink(buffer); // should report
    InferTaint.inferSensitiveSink(alias); // should report
    // Mutant
    StringBuffer c = new StringBuffer();
    c.append(source);
    StringBuffer d = c.append("");
    InferTaint.inferSensitiveSink(c);
    InferTaint.inferSensitiveSink(d);
  }

  void propagateFootprint(String param) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(param);
    InferTaint.inferSensitiveSink(buffer);
    // Mutant
    StringBuffer e = new StringBuffer();
    e.append(param);
    InferTaint.inferSensitiveSink(e);
  }

  void callPropagateFootprintBad() {
    propagateFootprint((String) InferTaint.inferSecretSource());
    // Mutant
    propagateFootprint((String) InferTaint.inferSecretSource());
  }

  static void propagateViaInterfaceCodeBad(Interface i) {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = i.interfaceMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    // Mutant
    Object f = InferTaint.inferSecretSource();
    Object g = i.interfaceMethod(f);
    InferTaint.inferSensitiveSink(g);
  }

  void propagateViaUnknownNativeCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    // Mutant
    Object h = InferTaint.inferSecretSource();
    Object i = nativeMethod(h);
    InferTaint.inferSensitiveSink(i);
  }

  static void propagateViaUnknownAbstractCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    // Mutant
    Object j = InferTaint.inferSecretSource();
    Object k = nativeMethod(j);
    InferTaint.inferSensitiveSink(k);
  }
}