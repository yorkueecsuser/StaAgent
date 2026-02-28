import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    callMySink(o3);
    callMySink(o4);
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
  }

  // Mutated code
  void mutatedSourceMethod() {
    Obj x = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, x, null, null);
  }

  void mutatedCallSameSink(Obj a, Obj b, Obj c, Obj d) {
    callMySink(a);
    callMySinkIndirect(b); // test that we expand this sink in the trace
    callMySink(c);
    callMySink(d);
  }

  void mutatedCallMySinkIndirect(Obj y) {
    callMySink(y);
  }

  void mutatedCallMySink(Obj z) {
    InferTaint.inferSensitiveSink(z);
  }
}