import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();
    // Mutant: Dead Store
    String qjvhtwmb = "unusedString";
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();
    // Mutant: Dead Store
    int kxncbvfr = 42;
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();
    // Mutant: Dead Store
    boolean jhtyvbnm = true;
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();
    // Mutant: Dead Store
    double wertypoi = 3.14;
  }
}