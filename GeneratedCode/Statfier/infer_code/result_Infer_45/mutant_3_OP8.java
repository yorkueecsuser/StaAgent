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
    String b = new String(source);
    InferTaint.inferSensitiveSink(b);
  }

  static void propagateViaUnknownConstructorOk() {
    String unknownConstructor = new String("");
    InferTaint.inferSensitiveSink(unknownConstructor);
    // Mutant
    String c = new String("");
    InferTaint.inferSensitiveSink(c);
  }

  void propagateViaUnknownCodeOk(Interface i) {
    Object notASource = new Object();
    Object launderedSource1 = nativeMethod(notASource);
    Object launderedSource2 = abstractMethod(launderedSource1);
    Object launderedSource3 = i.interfaceMethod(launderedSource2);
    InferTaint.inferSensitiveSink(launderedSource3);
    // Mutant
    Object d = new Object();
    Object e = nativeMethod(d);
    Object f = abstractMethod(e);
    Object g = i.interfaceMethod(f);
    InferTaint.inferSensitiveSink(g);
  }

  void callUnknownSetterBad(Intent i) {
    Object source = InferTaint.inferSecretSource();
    // we don't analyze the source code for Android, so this will be unknown
    i.writeToParcel((Parcel) source, 0);
    InferTaint.inferSensitiveSink(i);
    // Mutant
    Object h = InferTaint.inferSecretSource();
    i.writeToParcel((Parcel) h, 0);
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
    String i = (String) InferTaint.inferSecretSource();
    StringBuffer j = new StringBuffer();
    j.append(i); // j is now tainted
    StringBuffer k = j.append("");
    InferTaint.inferSensitiveSink(j); // should report
    InferTaint.inferSensitiveSink(k); // should report
  }

  void propagateFootprint(String param) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(param);
    InferTaint.inferSensitiveSink(buffer);
    // Mutant
    StringBuffer l = new StringBuffer();
    l.append(param);
    InferTaint.inferSensitiveSink(l);
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
    Object m = InferTaint.inferSecretSource();
    Object n = i.interfaceMethod(m);
    InferTaint.inferSensitiveSink(n);
  }

  void propagateViaUnknownNativeCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    // Mutant
    Object o = InferTaint.inferSecretSource();
    Object p = nativeMethod(o);
    InferTaint.inferSensitiveSink(p);
  }

  static void propagateViaUnknownAbstractCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    // Mutant
    Object q = InferTaint.inferSecretSource();
    Object r = nativeMethod(q);
    InferTaint.inferSensitiveSink(r);
  }
}