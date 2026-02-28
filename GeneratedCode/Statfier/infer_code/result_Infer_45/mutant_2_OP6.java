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

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  static void propagateViaUnknownConstructorOk() {
    String unknownConstructor = new String("");
    InferTaint.inferSensitiveSink(unknownConstructor);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void propagateViaUnknownCodeOk(Interface i) {
    Object notASource = new Object();
    Object launderedSource1 = nativeMethod(notASource);
    Object launderedSource2 = abstractMethod(launderedSource1);
    Object launderedSource3 = i.interfaceMethod(launderedSource2);
    InferTaint.inferSensitiveSink(launderedSource3);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void callUnknownSetterBad(Intent i) {
    Object source = InferTaint.inferSecretSource();
    // we don't analyze the source code for Android, so this will be unknown
    i.writeToParcel((Parcel) source, 0);
    InferTaint.inferSensitiveSink(i);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void propagateEmptyBad() {
    String source = (String) InferTaint.inferSecretSource();
    StringBuffer buffer = new StringBuffer();
    buffer.append(source); // buffer is now tainted
    // even though "" is not tainted, buffer and alias should still be tainted
    StringBuffer alias = buffer.append("");
    InferTaint.inferSensitiveSink(buffer); // should report
    InferTaint.inferSensitiveSink(alias); // should report

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void propagateFootprint(String param) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(param);
    InferTaint.inferSensitiveSink(buffer);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void callPropagateFootprintBad() {
    propagateFootprint((String) InferTaint.inferSecretSource());

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  static void propagateViaInterfaceCodeBad(Interface i) {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = i.interfaceMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void propagateViaUnknownNativeCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  static void propagateViaUnknownAbstractCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}