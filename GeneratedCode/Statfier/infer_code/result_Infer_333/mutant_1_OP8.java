import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();
    
    // Mutant
    Object a = null;
    InferBuiltins.assume(a!= null);
    a.toString();
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();
    
    // Mutant
    Object b = null;
    InferBuiltins.assume(x!= null);
    b.toString();
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();
    
    // Mutant
    Object c = null;
    int j = 0;
    InferBuiltins.assume(j!= 0);
    c.toString();
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();
    
    // Mutant
    Object d = null;
    InferBuiltins.assume(d == null);
    d.toString();
  }
}