import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    callMySink(o2); // Duplicate of callMySink(o2) for mutation
    callMySink(o3);
    callMySink(o4);
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
    callMySink(o); // Duplicate of callMySink(o) for mutation
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
  }
}