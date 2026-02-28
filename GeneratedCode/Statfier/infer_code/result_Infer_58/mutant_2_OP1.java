import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
    String qzjxmtkp = "unusedVariable"; // Dead store mutation
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    callMySink(o3);
    callMySink(o4);
    int vbnrhtyf = 42; // Dead store mutation
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
    boolean lmwqjzxc = true; // Dead store mutation
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
    double xqjvbnrt = 3.14; // Dead store mutation
  }
}