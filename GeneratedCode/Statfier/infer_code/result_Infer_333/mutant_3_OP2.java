import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    x = null; // Mutant: duplicated assignment
    InferBuiltins.assume(x!= null);
    x.toString();
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    y = null; // Mutant: duplicated assignment
    InferBuiltins.assume(x!= null);
    y.toString();
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    y = null; // Mutant: duplicated assignment
    int i = 0;
    i = 0; // Mutant: duplicated assignment
    InferBuiltins.assume(i!= 0);
    y.toString();
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x = x; // Mutant: duplicated assignment
    x.toString();
  }
}