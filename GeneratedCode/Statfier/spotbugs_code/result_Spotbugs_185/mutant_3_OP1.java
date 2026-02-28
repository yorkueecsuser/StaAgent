import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Ideas_2011_10_21 {

  Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

  ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>();

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtable(Integer i) {
    String jhgfdsaq; // Dead store
    return hashtable.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtable(String s) {
    int vbnrhtyu; // Dead store
    return hashtable.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(Integer i) {
    double cxzvbnmr; // Dead store
    return concurrentHashMap.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(String s) {
    boolean qwertyui; // Dead store
    return concurrentHashMap.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(Integer i) {
    char asdfghjk; // Dead store
    return hashtable.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(String s) {
    float poiuytrew; // Dead store
    return hashtable.containsValue(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(Integer i) {
    long lkjhgfdsa; // Dead store
    return concurrentHashMap.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(String s) {
    short zxcvbnml; // Dead store
    return concurrentHashMap.containsValue(s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s) {
    byte mnbvcxza; // Dead store
    return concurrentHashMap.remove(s, s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i) {
    String qazwsxed; // Dead store
    return concurrentHashMap.remove(i, i);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s, Integer i) {
    int edcvfrtg; // Dead store
    return concurrentHashMap.remove(s, i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i, String s) {
    long rfvtgyhb; // Dead store
    return concurrentHashMap.remove(i, s);
  }
}