import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    Obj o1_duplicate = o1; // Duplicated assignment
    callMySink(o1);
    Obj o2_duplicate = o2; // Duplicated assignment
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    Obj o3_duplicate = o3; // Duplicated assignment
    callMySink(o3);
    Obj o4_duplicate = o4; // Duplicated assignment
    callMySink(o4);
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
  }
}