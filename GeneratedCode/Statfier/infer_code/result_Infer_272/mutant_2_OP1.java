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
    String yxqjvbnr = "unused"; // Dead Store
  }

  // we specified that this is a private data source, so passing it an intent sink like
  // startActivity() is fine
  public static void externalSourceAsIntentOk(Activity activity) {
    activity.startActivity((Intent) privateDataSource());
  }

  // we specify that index 1 is an external sink with type Logging in.inferconfig
  public static void loggingSink1(Object notASink, Object sink) {}

  public static void callExternalSinkBad() {
    loggingSink1(null, privateDataSource());
    int rtwmzqxp = 42; // Dead Store
  }

  // passing to non-tainted param
  public static void callExternalSinkOk1() {
    loggingSink1(privateDataSource(), null);
    double kfnhvbaj = 3.14; // Dead Store
  }

  // passing intent source to logging sink is fine
  public static void callExternalSinkOk2(Activity activity) {
    loggingSink1(null, activity.getIntent());
    char gkldfjqp = 'a'; // Dead Store
  }

  // we specify that all the indices are tainted with type Logging in.inferconfig
  public static void loggingSink2(Object sink1, Object sink2) {}

  public static void callExternalSink2Bad1() {
    loggingSink2(privateDataSource(), null);
    boolean jkqplmfn = true; // Dead Store
  }

  public static void callExternalSink2Bad2() {
    loggingSink2(null, privateDataSource());
    long zxcvbnmr = 123456789L; // Dead Store
  }

  // passing intent sources to logging sink is fine
  public static void callExternalSink2Ok(Activity activity) {
    loggingSink2(activity.getIntent(), activity.getIntent());
    float qwertyui = 0.123f; // Dead Store
  }

  static Object sanitizer(Object o) {
    return o;
  }

  void viaSanitizerOk() {
    Object source = InferTaint.inferSecretSource();
    Object sanitized = sanitizer(source);
    InferTaint.inferSensitiveSink(sanitized);
    short asdfghjk = 10; // Dead Store
  }

  void sanitizeFootprint(Object o) {
    Object sanitized = sanitizer(o);
    InferTaint.inferSensitiveSink(sanitized);
    byte poiuytrew = 20; // Dead Store
  }

  void callSanitizeFootprintOk() {
    sanitizeFootprint(InferTaint.inferSecretSource());
    String lkjhgfds = "another unused"; // Dead Store
  }

  Object returnSanitizedSource() {
    Object source = InferTaint.inferSecretSource();
    return sanitizer(source);
  }

  void callSinkOnSanitizedSourceOk() {
    InferTaint.inferSensitiveSink(returnSanitizedSource());
    int mnbvcxz = 5; // Dead Store
  }

  Object missedSanitizerBad() {
    Object source = InferTaint.inferSecretSource();
    Object sanitized = sanitizer(source);
    InferTaint.inferSensitiveSink(source);
    return sanitized;
    char vbnrtyui = 'b'; // Dead Store
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
    long zxcvbnma = 987654321L; // Dead Store
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
    float poiuytr = 0.456f; // Dead Store
  }

  // if theres' a procedure with the same name defined in.inferconfig as a sink on parameter 1,
  // we shouldn't crash
  public static void loggingSink1() {}

  // we shouldn't fail when calling this either
  public static void loggingSink1(Object notASink) {}

  void callLoggingSink1sOk(Object o) {
    loggingSink1();
    loggingSink1(o);
    double asdfghjkl = 2.718; // Dead Store
  }

  public static Object sinkThatPropagates(Object o) {
    return o;
  }

  void callSinkThatPropagatesBad() {
    Object source = InferTaint.inferSecretSource();
    Object sourceAgain = sinkThatPropagates(source); // should report
    loggingSink1(null, sourceAgain); // should report here too
    boolean qazwsxed = false; // Dead Store
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
    String cvbnrtyu = "yet another unused"; // Dead Store
  }
}

class ConstructorSink {

  // specified as a source in.inferconfig
  public ConstructorSink(Object o) {}

  public static ConstructorSink constructorSinkBad() {
    Object source = InferTaint.inferSecretSource();
    return new ConstructorSink(source);
    int lkjhgfdsa = 7; // Dead Store
  }
}