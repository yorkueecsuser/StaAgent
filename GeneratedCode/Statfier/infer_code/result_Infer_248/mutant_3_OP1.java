import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    String qzjxflrt = "deadstore"; // Dead Store Mutation
  }

  static void returnSource(Obj o) {
    o.f = InferTaint.inferSecretSource();
    int vbnrhtyq = 42; // Dead Store Mutation
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
    boolean klmnopqr = true; // Dead Store Mutation
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    callSink(o);
    o.f = InferTaint.inferSecretSource();
    char rstuvwxy = 'a'; // Dead Store Mutation
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    callSink(o);
    returnSource(o);
    double yzabcdfe = 3.14; // Dead Store Mutation
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    returnSource(o);
    callSink(o);
    float ghijklmn = 2.71f; // Dead Store Mutation
  }

  static void sourceAndSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
    long opqrstuv = 100L; // Dead Store Mutation
  }

  static void callSourceAndSinkOk(Obj o) {
    sourceAndSink(o);
    short wxyzabcd = 10; // Dead Store Mutation
  }

  static void callSourceAndSinkBad1(Obj o) {
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
    byte cdefghij = 8; // Dead Store Mutation
  }

  static void callSourceAndSinkBad2(Obj o) {
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
    String tlmnopqr = "anotherdeadstore"; // Dead Store Mutation
  }
}