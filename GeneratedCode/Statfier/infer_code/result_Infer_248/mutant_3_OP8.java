import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
  }

  static void returnSource(Obj o) {
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    callSink(o);
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    callSink(o);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    returnSource(o);
    callSink(o);
  }

  static void sourceAndSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOk(Obj o) {
    sourceAndSink(o);
  }

  static void callSourceAndSinkBad1(Obj o) {
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
  }

  static void callSourceAndSinkBad2(Obj o) {
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
  }

  // Mutated code
  static void interproceduralFlowSensitivityOk1Mutant(Obj x) {
    InferTaint.inferSensitiveSink(x.f);
    returnSource(x);
  }

  static void interproceduralFlowSensitivityOk2Mutant(Obj y) {
    callSink(y);
    y.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3Mutant(Obj z) {
    callSink(z);
    returnSource(z);
  }

  static void interproceduralFlowSensitivityBadMutant(Obj w) {
    returnSource(w);
    callSink(w);
  }

  static void sourceAndSinkMutant(Obj v) {
    InferTaint.inferSensitiveSink(v.f);
    v.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOkMutant(Obj u) {
    sourceAndSink(u);
  }

  static void callSourceAndSinkBad1Mutant(Obj t) {
    sourceAndSink(t);
    InferTaint.inferSensitiveSink(t.f);
  }

  static void callSourceAndSinkBad2Mutant(Obj s) {
    s.f = InferTaint.inferSecretSource();
    sourceAndSink(s);
  }
}