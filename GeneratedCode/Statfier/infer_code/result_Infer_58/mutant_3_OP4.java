import codetoanalyze.java.InferTaint;

class Traces {
  void sourceMethod() {
    Obj source = (Obj) InferTaint.inferSecretSource();
    callSameSink(null, source, null, null);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block.");
    }
  }

  void callSameSink(Obj o1, Obj o2, Obj o3, Obj o4) {
    callMySink(o1);
    callMySinkIndirect(o2); // test that we expand this sink in the trace
    callMySink(o3);
    callMySink(o4);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in callSameSink.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in callSameSink.");
    }
  }

  void callMySinkIndirect(Obj o) {
    callMySink(o);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in callMySinkIndirect.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in callMySinkIndirect.");
    }
  }

  void callMySink(Obj o) {
    InferTaint.inferSensitiveSink(o);
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in callMySink.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in callMySink.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}