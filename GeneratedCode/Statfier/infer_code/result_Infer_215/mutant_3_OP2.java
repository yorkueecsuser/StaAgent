import android.app.Activity;
import android.content.Intent;
import codetoanalyze.java.InferTaint;

class Obj {
  Object f;
}

class TaintedFormals {

  public Activity mActivity;

  public void callSink(Object formal) {
    InferTaint.inferSensitiveSink(formal);
  }

  // taintedFormal1 and taintedFormal2 were are modeled as tainted
  public void taintedContextBad(
      String taintedFormal1, Intent untaintedFormal, Integer taintedFormal2) {
    InferTaint.inferSensitiveSink(taintedFormal1); // should report here
    InferTaint.inferSensitiveSink(taintedFormal1); // DUPLICATION: duplicated line
    InferTaint.inferSensitiveSink(taintedFormal2); // should report here
    InferTaint.inferSensitiveSink(taintedFormal2); // DUPLICATION: duplicated line
    callSink(taintedFormal1); // should report here
    callSink(taintedFormal1); // DUPLICATION: duplicated line
    callSink(taintedFormal2); // should report here
    callSink(taintedFormal2); // DUPLICATION: duplicated line

    // using different sink to avoid confusion with the above
    mActivity.startService(untaintedFormal); // should not report here
  }

  public Object taintedContextBad(String taintedFormal) {
    return taintedFormal;
  }

  public void callTaintedContextBad1(String formal) {
    Object tainted = taintedContextBad(formal);
    InferTaint.inferSensitiveSink(tainted);
    InferTaint.inferSensitiveSink(tainted); // DUPLICATION: duplicated line
  }

  public void callTaintedContextBad2() {
    taintedContextBad(null, (Intent) InferTaint.inferSecretSource(), null);
    taintedContextBad(null, (Intent) InferTaint.inferSecretSource(), null); // DUPLICATION: duplicated line
  }

  public void callTaintedContextOk1() {
    taintedContextBad("foo", null, null);
    taintedContextBad("foo", null, null); // DUPLICATION: duplicated line
  }

  // shouldn't report here, otherwise we will double report
  public void callTaintedContextOk2() {
    taintedContextBad(null, null, new Integer(1));
    taintedContextBad(null, null, new Integer(1)); // DUPLICATION: duplicated line
  }
}