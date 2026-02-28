import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.concurrent.ConcurrentHashMap;

class AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION {

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug1(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    if (anyMap.get(anyKey) == null) {
      anyMap.put(anyKey, anyValue);
      anyMap.put(anyKey, anyValue); // Mutant: Duplicate assignment
    }
  }

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug2(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    if (!anyMap.containsKey(anyKey)) {
      anyMap.put(anyKey, anyValue);
      anyMap.put(anyKey, anyValue); // Mutant: Duplicate assignment
    }
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug(
      ConcurrentHashMap anyMap1, ConcurrentHashMap anyMap2, Object anyKey, Object anyValue) {
    Object value = anyMap1.get(anyKey);
    anyMap2.put(anyKey, value);
    anyMap2.put(anyKey, value); // Mutant: Duplicate assignment
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug2(
      ConcurrentHashMap anyMap1, ConcurrentHashMap anyMap2, Object anyKey, Object anyValue) {
    if (!anyMap1.containsKey(anyKey)) {
      anyMap2.put(anyKey, anyValue);
      anyMap2.put(anyKey, anyValue); // Mutant: Duplicate assignment
    }
  }
}