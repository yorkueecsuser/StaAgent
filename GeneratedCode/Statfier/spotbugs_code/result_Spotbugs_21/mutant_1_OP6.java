import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.concurrent.ConcurrentHashMap;

class AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION {

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug1(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    if (anyMap.get(anyKey) == null) anyMap.put(anyKey, anyValue);
  }

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug2(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    if (!anyMap.containsKey(anyKey)) anyMap.put(anyKey, anyValue);
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug(
      ConcurrentHashMap anyMap1, ConcurrentHashMap anyMap2, Object anyKey, Object anyValue) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    Object value = anyMap1.get(anyKey);
    anyMap2.put(anyKey, value);
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug2(
      ConcurrentHashMap anyMap1, ConcurrentHashMap anyMap2, Object anyKey, Object anyValue) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    if (!anyMap1.containsKey(anyKey)) anyMap2.put(anyKey, anyValue);
  }

  private boolean getCondition() {
    return false; // This method returns false, making the loop condition always false
  }
}