import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class inefficientKeysetIterator {

  void inefficient_loop_bad(HashMap<String, Integer> testMap) {
    for (String key : testMap.keySet()) {
      testMap.get(key);
    }
  }

  void inefficient_loop_itr_bad(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    while (itr2.hasNext()) {
      String key = (String) itr2.next();
      testMap.get(key);
    }
  }

  void inefficient_loop_itr_heur_bad_FN(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    int i = 0;
    int j = 1;
    int k = 2;
    int l = 3;
    while (itr2.hasNext()) {
      String key = (String) itr2.next();
      testMap.get(key);
    }
  }

  void inefficient_loop_itr_heur_bad(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    int i = 0;
    while (itr2.hasNext()) {
      String key = (String) itr2.next();
      testMap.get(key);
    }
  }

  void inefficient_loop_itr_heur_btw_bad(HashMap<String, Integer> testMap) {

    Set<String> keySet = testMap.keySet();
    int i = 0;
    int j = 1;
    int l = 3;
    Iterator itr2 = keySet.iterator();
    while (itr2.hasNext()) {
      String key = (String) itr2.next();
      testMap.get(key);
    }
  }

  void efficient_loop_itr_ok(HashMap<String, Integer> testMap) {

    Iterator<Map.Entry<String, Integer>> itr1 = testMap.entrySet().iterator();
    while (itr1.hasNext()) {
      Map.Entry<String, Integer> entry = itr1.next();
      entry.getKey();
      entry.getValue();
    }
  }

  void efficient_loop_ok(HashMap<String, Integer> testMap) {
    for (Map.Entry<String, Integer> entry : testMap.entrySet()) {
      entry.getKey();
      entry.getValue();
    }
  }

  void negative_loop_ok(HashMap<String, Integer> testMap1, HashMap<String, Integer> testMap2) {
    for (String key : testMap1.keySet()) {
      testMap2.get(key);
    }
  }

  // Bundle doesn't implement Map hence have any entrySet
  public void from_bundle_ok(Bundle extras) {
    for (String key : extras.keySet()) {
      Object t = extras.get(key);
    }
  }

  // ArrayMap extends SimpleMap.
  void inefficient_arraymap_loop_bad(ArrayMap<String, Integer> arrayMap) {
    for (String key : arrayMap.keySet()) {
      arrayMap.get(key);
    }
  }

  // Mutants
  void inefficient_loop_bad_mutant(HashMap<String, Integer> z) {
    for (String x : z.keySet()) {
      z.get(x);
    }
  }

  void inefficient_loop_itr_bad_mutant(HashMap<String, Integer> y) {

    Iterator w = y.keySet().iterator();
    while (w.hasNext()) {
      String v = (String) w.next();
      y.get(v);
    }
  }

  void inefficient_loop_itr_heur_bad_FN_mutant(HashMap<String, Integer> u) {

    Iterator t = u.keySet().iterator();
    int s = 0;
    int r = 1;
    int q = 2;
    int p = 3;
    while (t.hasNext()) {
      String o = (String) t.next();
      u.get(o);
    }
  }

  void inefficient_loop_itr_heur_bad_mutant(HashMap<String, Integer> n) {

    Iterator m = n.keySet().iterator();
    int l = 0;
    while (m.hasNext()) {
      String k = (String) m.next();
      n.get(k);
    }
  }

  void inefficient_loop_itr_heur_btw_bad_mutant(HashMap<String, Integer> j) {

    Set<String> i = j.keySet();
    int h = 0;
    int g = 1;
    int f = 3;
    Iterator e = i.iterator();
    while (e.hasNext()) {
      String d = (String) e.next();
      j.get(d);
    }
  }

  void efficient_loop_itr_ok_mutant(HashMap<String, Integer> c) {

    Iterator<Map.Entry<String, Integer>> b = c.entrySet().iterator();
    while (b.hasNext()) {
      Map.Entry<String, Integer> a = b.next();
      a.getKey();
      a.getValue();
    }
  }

  void efficient_loop_ok_mutant(HashMap<String, Integer> z) {
    for (Map.Entry<String, Integer> y : z.entrySet()) {
      y.getKey();
      y.getValue();
    }
  }

  void negative_loop_ok_mutant(HashMap<String, Integer> x, HashMap<String, Integer> w) {
    for (String v : x.keySet()) {
      w.get(v);
    }
  }

  // Bundle doesn't implement Map hence have any entrySet
  public void from_bundle_ok_mutant(Bundle u) {
    for (String t : u.keySet()) {
      Object s = u.get(t);
    }
  }

  // ArrayMap extends SimpleMap.
  void inefficient_arraymap_loop_bad_mutant(ArrayMap<String, Integer> r) {
    for (String q : r.keySet()) {
      r.get(q);
    }
  }
}