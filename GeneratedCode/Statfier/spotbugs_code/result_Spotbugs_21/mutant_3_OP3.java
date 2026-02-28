import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.concurrent.ConcurrentHashMap;

class AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION {

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug1(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    if (anyMap.get(anyKey) == null) anyMap.put(anyKey, anyValue);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug2(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    if (!anyMap.containsKey(anyKey)) anyMap.put(anyKey, anyValue);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug(
      ConcurrentHashMap anyMap1, ConcurrentHashMap anyMap2, Object anyKey, Object anyValue) {
    Object value = anyMap1.get(anyKey);
    anyMap2.put(anyKey, value);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is yet another unreachable statement");
    }
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug2(
      ConcurrentHashMap anyMap1, ConcurrentHashMap anyMap2, Object anyKey, Object anyValue) {
    if (!anyMap1.containsKey(anyKey)) anyMap2.put(anyKey, anyValue);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is one more unreachable statement");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but the compiler won't treat it as a constant
  }
}