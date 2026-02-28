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

  // Mutated methods
  void inefficient_loop_bad_m(HashMap<String, Integer> a) {
    for (String b : a.keySet()) {
      a.get(b);
    }
  }

  void inefficient_loop_itr_bad_m(HashMap<String, Integer> c) {

    Iterator d = c.keySet().iterator();
    while (d.hasNext()) {
      String e = (String) d.next();
      c.get(e);
    }
  }

  void inefficient_loop_itr_heur_bad_FN_m(HashMap<String, Integer> f) {

    Iterator g = f.keySet().iterator();
    int h = 0;
    int i = 1;
    int j = 2;
    int k = 3;
    while (g.hasNext()) {
      String l = (String) g.next();
      f.get(l);
    }
  }

  void inefficient_loop_itr_heur_bad_m(HashMap<String, Integer> m) {

    Iterator n = m.keySet().iterator();
    int o = 0;
    while (n.hasNext()) {
      String p = (String) n.next();
      m.get(p);
    }
  }

  void inefficient_loop_itr_heur_btw_bad_m(HashMap<String, Integer> q) {

    Set<String> r = q.keySet();
    int s = 0;
    int t = 1;
    int u = 3;
    Iterator v = r.iterator();
    while (v.hasNext()) {
      String w = (String) v.next();
      q.get(w);
    }
  }

  void efficient_loop_itr_ok_m(HashMap<String, Integer> x) {

    Iterator<Map.Entry<String, Integer>> y = x.entrySet().iterator();
    while (y.hasNext()) {
      Map.Entry<String, Integer> z = y.next();
      z.getKey();
      z.getValue();
    }
  }

  void efficient_loop_ok_m(HashMap<String, Integer> a) {
    for (Map.Entry<String, Integer> b : a.entrySet()) {
      b.getKey();
      b.getValue();
    }
  }

  void negative_loop_ok_m(HashMap<String, Integer> c, HashMap<String, Integer> d) {
    for (String e : c.keySet()) {
      d.get(e);
    }
  }

  // Bundle doesn't implement Map hence have any entrySet
  public void from_bundle_ok_m(Bundle f) {
    for (String g : f.keySet()) {
      Object h = f.get(g);
    }
  }

  // ArrayMap extends SimpleMap.
  void inefficient_arraymap_loop_bad_m(ArrayMap<String, Integer> i) {
    for (String j : i.keySet()) {
      i.get(j);
    }
  }
}