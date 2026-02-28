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
    String unknownConstructorCopy = new String(source); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(unknownConstructor);
  }

  static void propagateViaUnknownConstructorOk() {
    String unknownConstructor = new String("");
    String unknownConstructorCopy = new String(""); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(unknownConstructor);
  }

  void propagateViaUnknownCodeOk(Interface i) {
    Object notASource = new Object();
    Object launderedSource1 = nativeMethod(notASource);
    Object launderedSource2 = abstractMethod(launderedSource1);
    Object launderedSource3 = i.interfaceMethod(launderedSource2);
    Object launderedSource3Copy = i.interfaceMethod(launderedSource2); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(launderedSource3);
  }

  void callUnknownSetterBad(Intent i) {
    Object source = InferTaint.inferSecretSource();
    // we don't analyze the source code for Android, so this will be unknown
    i.writeToParcel((Parcel) source, 0);
    InferTaint.inferSensitiveSink(i);
  }

  void propagateEmptyBad() {
    String source = (String) InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source); // buffer is now tainted
    // even though "" is not tainted, buffer and alias should still be tainted
    StringBuffer alias = buffer.append("");
    StringBuffer aliasCopy = buffer.append(""); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(buffer); // should report
    InferTaint.inferSensitiveSink(alias); // should report
  }

  void propagateFootprint(String param) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(param);
    StringBuffer bufferCopy = new StringBuffer(); // Mutation: duplicated assignment
    bufferCopy.append(param); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(buffer);
  }

  void callPropagateFootprintBad() {
    propagateFootprint((String) InferTaint.inferSecretSource());
    propagateFootprint((String) InferTaint.inferSecretSource()); // Mutation: duplicated assignment
  }

  static void propagateViaInterfaceCodeBad(Interface i) {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = i.interfaceMethod(source);
    Object launderedSourceCopy = i.interfaceMethod(source); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(launderedSource);
  }

  void propagateViaUnknownNativeCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    Object launderedSourceCopy = nativeMethod(source); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(launderedSource);
  }

  static void propagateViaUnknownAbstractCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    Object launderedSourceCopy = nativeMethod(source); // Mutation: duplicated assignment
    InferTaint.inferSensitiveSink(launderedSource);
  }
}