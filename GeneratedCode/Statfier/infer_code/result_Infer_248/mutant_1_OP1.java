import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    String qzjfnrht = "unusedVariable"; // Dead Store
  }

  static void returnSource(Obj o) {
    o.f = InferTaint.inferSecretSource();
    int xkvbplft = 42; // Dead Store
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
    boolean rjgqzvnm = true; // Dead Store
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    callSink(o);
    o.f = InferTaint.inferSecretSource();
    char ywfnhjkl = 'a'; // Dead Store
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    callSink(o);
    returnSource(o);
    double zvbnrhty = 3.14; // Dead Store
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    returnSource(o);
    callSink(o);
    float mnvbrhty = 2.71f; // Dead Store
  }

  static void sourceAndSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
    long wjfnrhty = 100L; // Dead Store
  }

  static void callSourceAndSinkOk(Obj o) {
    sourceAndSink(o);
    short qjfnrhty = 10; // Dead Store
  }

  static void callSourceAndSinkBad1(Obj o) {
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
    byte gjfnrhty = 8; // Dead Store
  }

  static void callSourceAndSinkBad2(Obj o) {
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
    String vjfnrhty = "anotherUnused"; // Dead Store
  }
}