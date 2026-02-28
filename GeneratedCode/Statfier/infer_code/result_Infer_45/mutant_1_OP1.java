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
    String qzjxvbnr = "deadstore"; // Dead store mutation
  }

  static void propagateViaUnknownConstructorOk() {
    String unknownConstructor = new String("");
    InferTaint.inferSensitiveSink(unknownConstructor);
    int lmnpqrst = 42; // Dead store mutation
  }

  void propagateViaUnknownCodeOk(Interface i) {
    Object notASource = new Object();
    Object launderedSource1 = nativeMethod(notASource);
    Object launderedSource2 = abstractMethod(launderedSource1);
    Object launderedSource3 = i.interfaceMethod(launderedSource2);
    InferTaint.inferSensitiveSink(launderedSource3);
    boolean abcdefgh = true; // Dead store mutation
  }

  void callUnknownSetterBad(Intent i) {
    Object source = InferTaint.inferSecretSource();
    // we don't analyze the source code for Android, so this will be unknown
    i.writeToParcel((Parcel) source, 0);
    InferTaint.inferSensitiveSink(i);
    double wxyzabcd = 3.14; // Dead store mutation
  }

  void propagateEmptyBad() {
    String source = (String) InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source); // buffer is now tainted
    // even though "" is not tainted, buffer and alias should still be tainted
    StringBuffer alias = buffer.append("");
    InferTaint.inferSensitiveSink(buffer); // should report
    InferTaint.inferSensitiveSink(alias); // should report
    char ijklmnop = 'a'; // Dead store mutation
  }

  void propagateFootprint(String param) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(param);
    InferTaint.inferSensitiveSink(buffer);
    float opqrstuv = 2.71f; // Dead store mutation
  }

  void callPropagateFootprintBad() {
    propagateFootprint((String) InferTaint.inferSecretSource());
    long vwxyzabc = 100L; // Dead store mutation
  }

  static void propagateViaInterfaceCodeBad(Interface i) {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = i.interfaceMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    short cdefghij = 10; // Dead store mutation
  }

  void propagateViaUnknownNativeCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    byte klmnopqr = 5; // Dead store mutation
  }

  static void propagateViaUnknownAbstractCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);
    String stuvwxyz = "anotherdeadstore"; // Dead store mutation
  }
}