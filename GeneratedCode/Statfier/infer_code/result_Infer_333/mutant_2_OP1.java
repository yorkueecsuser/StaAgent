import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();
    String jxqftrbv = "unused"; // Dead Store mutation
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();
    int wvbnrhty = 42; // Dead Store mutation
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();
    boolean klmnopqr = true; // Dead Store mutation
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();
    double rstuvwxy = 3.14; // Dead Store mutation
  }
}