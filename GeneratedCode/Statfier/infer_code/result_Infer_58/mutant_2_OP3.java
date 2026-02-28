import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    callMySink(o3);
    callMySink(o4);
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in callSameSink.");
    }
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in callMySinkIndirect.");
    }
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in callMySink.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}