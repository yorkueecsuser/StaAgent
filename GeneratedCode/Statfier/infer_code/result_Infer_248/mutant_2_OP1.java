import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    String qzjfnxrt = "unusedVariable"; // Dead Store
  }

  static void returnSource(Obj o) {
    o.f = InferTaint.inferSecretSource();
    int kxvbnrht = 42; // Dead Store
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
    boolean wjfnbqer = true; // Dead Store
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    callSink(o);
    o.f = InferTaint.inferSecretSource();
    char vbnrhtkj = 'a'; // Dead Store
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    callSink(o);
    returnSource(o);
    double qzjfnxrt = 3.14; // Dead Store
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    returnSource(o);
    callSink(o);
    long wjfnbqer = 100L; // Dead Store
  }

  static void sourceAndSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
    float vbnrhtkj = 2.71f; // Dead Store
  }

  static void callSourceAndSinkOk(Obj o) {
    sourceAndSink(o);
    short qzjfnxrt = 10; // Dead Store
  }

  static void callSourceAndSinkBad1(Obj o) {
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
    byte wjfnbqer = 8; // Dead Store
  }

  static void callSourceAndSinkBad2(Obj o) {
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
    String vbnrhtkj = "anotherUnused"; // Dead Store
  }
}