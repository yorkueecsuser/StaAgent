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
    String qvbnrhty; // Dead store
    return hashtable.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtable(String s) {
    int zxcvbnmr; // Dead store
    return hashtable.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(Integer i) {
    double plmoknji; // Dead store
    return concurrentHashMap.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(String s) {
    boolean fghjklpo; // Dead store
    return concurrentHashMap.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(Integer i) {
    char yuiopasd; // Dead store
    return hashtable.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(String s) {
    long qwertyui; // Dead store
    return hashtable.containsValue(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(Integer i) {
    float mnbvcxza; // Dead store
    return concurrentHashMap.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(String s) {
    short asdfghjk; // Dead store
    return concurrentHashMap.containsValue(s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s) {
    byte lkjhgfds; // Dead store
    return concurrentHashMap.remove(s, s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i) {
    String poiuytrew; // Dead store
    return concurrentHashMap.remove(i, i);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s, Integer i) {
    int vbnm,lkjhg; // Dead store
    return concurrentHashMap.remove(s, i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i, String s) {
    long cvbnm,poiuyt; // Dead store
    return concurrentHashMap.remove(i, s);
  }
}