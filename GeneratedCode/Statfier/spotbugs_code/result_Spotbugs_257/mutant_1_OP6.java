import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    // Mutant: Adding an unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return loop();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    // Mutant: Adding an unreachable for loop
    boolean conditionFor = getConditionForLoop2();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return loop2();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    // Mutant: Adding an unreachable for loop
    boolean conditionFor = getConditionForLoop3();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return loop3();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getConditionForLoop() {
    return false;
  }

  // Another method to provide a dynamic condition that is always false
  private boolean getConditionForLoop2() {
    return false;
  }

  // Yet another method to provide a dynamic condition that is always false
  private boolean getConditionForLoop3() {
    return false;
  }
}