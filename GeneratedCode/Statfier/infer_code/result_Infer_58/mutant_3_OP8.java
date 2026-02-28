import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
    callSameSink(x, source, y, z); // Mutant: Renamed o1 to x, o3 to y, o4 to z
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    callMySink(o3);
    callMySink(o4);
    callMySink(a); // Mutant: Added new variable a
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
    callMySink(b); // Mutant: Added new variable b
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
    InferTaint.inferSensitiveSink(c); // Mutant: Added new variable c
  }
}