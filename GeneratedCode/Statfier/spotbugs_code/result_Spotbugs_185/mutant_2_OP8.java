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
    return hashtable.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtable(String s) {
    return hashtable.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(Integer i) {
    return concurrentHashMap.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(String s) {
    return concurrentHashMap.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(Integer i) {
    return hashtable.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(String s) {
    return hashtable.containsValue(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(Integer i) {
    return concurrentHashMap.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(String s) {
    return concurrentHashMap.containsValue(s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s) {
    return concurrentHashMap.remove(s, s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i) {
    return concurrentHashMap.remove(i, i);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s, Integer i) {
    return concurrentHashMap.remove(s, i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i, String s) {
    return concurrentHashMap.remove(i, s);
  }

  // Mutated code
  Hashtable<String, Integer> b = new Hashtable<String, Integer>();

  ConcurrentHashMap<String, Integer> c = new ConcurrentHashMap<String, Integer>();

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtableMutated(Integer x) {
    return b.contains(x);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtableMutated(String y) {
    return b.contains(y);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMapMutated(Integer z) {
    return c.contains(z);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMapMutated(String w) {
    return c.contains(w);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtableMutated(Integer v) {
    return b.containsValue(v);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtableMutated(String u) {
    return b.containsValue(u);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMapMutated(Integer t) {
    return c.containsValue(t);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMapMutated(String r) {
    return c.containsValue(r);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemoveMutated(String q) {
    return c.remove(q, q);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemoveMutated(Integer p) {
    return c.remove(p, p);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testRemoveMutated(String o, Integer n) {
    return c.remove(o, n);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemoveMutated(Integer m, String l) {
    return c.remove(m, l);
  }
}