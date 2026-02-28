import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.concurrent.ConcurrentHashMap;

class AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION {

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug1(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    if (anyMap.get(anyKey) == null) anyMap.put(anyKey, anyValue);
  }

  @ExpectWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void bug2(ConcurrentHashMap anyMap, Object anyKey, Object anyValue) {
    if (!anyMap.containsKey(anyKey)) anyMap.put(anyKey, anyValue);
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug(
      ConcurrentHashMap map1, ConcurrentHashMap map2, Object key, Object value) {
    Object v = map1.get(key);
    map2.put(key, v);
  }

  @DesireNoWarning("AT_OPERATION_SEQUENCE_ON_CONCURRENT_ABSTRACTION")
  void notBug2(
      ConcurrentHashMap m1, ConcurrentHashMap m2, Object k, Object v) {
    if (!m1.containsKey(k)) m2.put(k, v);
  }
}