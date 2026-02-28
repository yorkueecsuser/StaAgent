import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    String abcdabcd; // Dead store
    callSameSink(null, source, null, null);
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    int efghijkl; // Dead store
    callMySink(o3);
    callMySink(o4);
  }

  void callMySinkIndirect(Obj o) {
    boolean lmnopqrs; // Dead store
    callMySink(o);
  }

  void callMySink(Obj o) {
    double tuvwxyza; // Dead store
    InferTaint.inferSensitiveSink(o);
  }
}