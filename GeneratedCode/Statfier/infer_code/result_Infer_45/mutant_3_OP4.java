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

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  static void propagateViaUnknownConstructorOk() {
    String unknownConstructor = new String("");
    InferTaint.inferSensitiveSink(unknownConstructor);
  }

  void propagateViaUnknownCodeOk(Interface i) {
    Object notASource = new Object();
    Object launderedSource1 = nativeMethod(notASource);
    Object launderedSource2 = abstractMethod(launderedSource1);
    Object launderedSource3 = i.interfaceMethod(launderedSource2);
    InferTaint.inferSensitiveSink(launderedSource3);
  }

  void callUnknownSetterBad(Intent i) {
    Object source = InferTaint.inferSecretSource();
    // we don't analyze the source code for Android, so this will be unknown
    i.writeToParcel((Parcel) source, 0);
    InferTaint.inferSensitiveSink(i);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
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

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  void propagateFootprint(String param) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(param);
    InferTaint.inferSensitiveSink(buffer);
  }

  void callPropagateFootprintBad() {
    propagateFootprint((String) InferTaint.inferSecretSource());

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  static void propagateViaInterfaceCodeBad(Interface i) {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = i.interfaceMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  void propagateViaUnknownNativeCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  static void propagateViaUnknownAbstractCodeBad() {
    Object source = InferTaint.inferSecretSource();
    Object launderedSource = nativeMethod(source);
    InferTaint.inferSensitiveSink(launderedSource);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}