import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import codetoanalyze.java.InferTaint;

/** Testing that sources and sinks specified in external JSON work correctly */
class ExternalSpecs {

  // we specify this as a source with kind PrivateData in.inferconfig
  private static Object privateDataSource() {
    return new Object();
  }

  public static void logExternalSourceBad() {
    Log.e("", (String) privateDataSource());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      Log.d("Unreachable", "This will never be executed");
    }
  }

  // we specified that this is a private data source, so passing it an intent sink like
  // startActivity() is fine
  public static void externalSourceAsIntentOk(Activity activity) {
    activity.startActivity((Intent) privateDataSource());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      activity.finish();
    }
  }

  // we specify that index 1 is an external sink with type Logging in.inferconfig
  public static void loggingSink1(Object notASink, Object sink) {}

  public static void callExternalSinkBad() {
    loggingSink1(null, privateDataSource());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink1(null, new Object());
    }
  }

  // passing to non-tainted param
  public static void callExternalSinkOk1() {
    loggingSink1(privateDataSource(), null);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink1(new Object(), null);
    }
  }

  // passing intent source to logging sink is fine
  public static void callExternalSinkOk2(Activity activity) {
    loggingSink1(null, activity.getIntent());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink1(null, new Intent());
    }
  }

  // we specify that all the indices are tainted with type Logging in.inferconfig
  public static void loggingSink2(Object sink1, Object sink2) {}

  public static void callExternalSink2Bad1() {
    loggingSink2(privateDataSource(), null);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink2(new Object(), null);
    }
  }

  public static void callExternalSink2Bad2() {
    loggingSink2(null, privateDataSource());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink2(null, new Object());
    }
  }

  // passing intent sources to logging sink is fine
  public static void callExternalSink2Ok(Activity activity) {
    loggingSink2(activity.getIntent(), activity.getIntent());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink2(new Intent(), new Intent());
    }
  }

  static Object sanitizer(Object o) {
    return o;
  }

  void viaSanitizerOk() {
    Object source = InferTaint.inferSecretSource();
    Object sanitized = sanitizer(source);
    InferTaint.inferSensitiveSink(sanitized);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      InferTaint.inferSensitiveSink(source);
    }
  }

  void sanitizeFootprint(Object o) {
    Object sanitized = sanitizer(o);
    InferTaint.inferSensitiveSink(sanitized);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      InferTaint.inferSensitiveSink(o);
    }
  }

  void callSanitizeFootprintOk() {
    sanitizeFootprint(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      sanitizeFootprint(new Object());
    }
  }

  Object returnSanitizedSource() {
    Object source = InferTaint.inferSecretSource();
    return sanitizer(source);
  }

  void callSinkOnSanitizedSourceOk() {
    InferTaint.inferSensitiveSink(returnSanitizedSource());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      InferTaint.inferSensitiveSink(new Object());
    }
  }

  Object missedSanitizerBad() {
    Object source = InferTaint.inferSecretSource();
    Object sanitized = sanitizer(source);
    InferTaint.inferSensitiveSink(source);
    return sanitized;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return new Object();
    }
  }

  void FN_sanitizeOneBranchBad(boolean b) {
    Object source = InferTaint.inferSecretSource();
    Object o;
    if (b) {
      o = sanitizer(source);
    } else {
      o = source;
    }
    InferTaint.inferSensitiveSink(o);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      InferTaint.inferSensitiveSink(sanitizer(source));
    }
  }

  Object sanitizeOneBranchInCallee(Object o, boolean b) {
    if (b) {
      return sanitizer(o);
    } else {
      return o;
    }
  }

  void FN_sanitizerWeakUpdateBad(boolean b) {
    Object source = InferTaint.inferSecretSource();
    Object o = sanitizeOneBranchInCallee(source, b);
    InferTaint.inferSensitiveSink(o);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      InferTaint.inferSensitiveSink(sanitizer(source));
    }
  }

  // if theres' a procedure with the same name defined in.inferconfig as a sink on parameter 1,
  // we shouldn't crash
  public static void loggingSink1() {}

  // we shouldn't fail when calling this either
  public static void loggingSink1(Object notASink) {}

  void callLoggingSink1sOk(Object o) {
    loggingSink1();
    loggingSink1(o);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink1(new Object());
    }
  }

  public static Object sinkThatPropagates(Object o) {
    return o;
  }

  void callSinkThatPropagatesBad() {
    Object source = InferTaint.inferSecretSource();
    Object sourceAgain = sinkThatPropagates(source); // should report
    loggingSink1(null, sourceAgain); // should report here too
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      loggingSink1(null, new Object());
    }
  }

  private static boolean getCondition() {
    return false;
  }
}

interface InterfaceSpec {

  // marked as source in.inferconfig
  public Object source();

  // marked as sink in.inferconfig
  public void sink(Object o);
}

class InterfaceSpecImpl implements InterfaceSpec {

  @Override
  public Object source() {
    return null;
  }

  @Override
  public void sink(Object o) {}

  public void externalSpecBad() {
    sink(source());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      sink(new Object());
    }
  }

  private static boolean getCondition() {
    return false;
  }
}

class ConstructorSink {

  // specified as a source in.inferconfig
  public ConstructorSink(Object o) {}

  public static ConstructorSink constructorSinkBad() {
    Object source = InferTaint.inferSecretSource();
    return new ConstructorSink(source);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return new ConstructorSink(new Object());
    }
  }

  private static boolean getCondition() {
    return false;
  }
}