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
  static void callSink(Obj x) {
    InferTaint.inferSensitiveSink(x.f);
  }

  static void returnSource(Obj y) {
    y.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk1(Obj z) {
    InferTaint.inferSensitiveSink(z.f);
    returnSource(z);
  }

  static void interproceduralFlowSensitivityOk2(Obj w) {
    callSink(w);
    w.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3(Obj v) {
    callSink(v);
    returnSource(v);
  }

  static void interproceduralFlowSensitivityBad(Obj u) {
    returnSource(u);
    callSink(u);
  }

  static void sourceAndSink(Obj t) {
    InferTaint.inferSensitiveSink(t.f);
    t.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOk(Obj s) {
    sourceAndSink(s);
  }

  static void callSourceAndSinkBad1(Obj r) {
    sourceAndSink(r);
    InferTaint.inferSensitiveSink(r.f);
  }

  static void callSourceAndSinkBad2(Obj q) {
    q.f = InferTaint.inferSecretSource();
    sourceAndSink(q);
  }
}