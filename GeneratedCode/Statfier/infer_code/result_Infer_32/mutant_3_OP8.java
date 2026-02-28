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
  void inefficient_loop_bad_m(HashMap<String, Integer> x) {
    for (String y : x.keySet()) {
      x.get(y);
    }
  }

  void inefficient_loop_itr_bad_m(HashMap<String, Integer> z) {

    Iterator w = z.keySet().iterator();
    while (w.hasNext()) {
      String v = (String) w.next();
      z.get(v);
    }
  }

  void inefficient_loop_itr_heur_bad_FN_m(HashMap<String, Integer> a) {

    Iterator b = a.keySet().iterator();
    int c = 0;
    int d = 1;
    int e = 2;
    int f = 3;
    while (b.hasNext()) {
      String g = (String) b.next();
      a.get(g);
    }
  }

  void inefficient_loop_itr_heur_bad_m(HashMap<String, Integer> h) {

    Iterator i = h.keySet().iterator();
    int j = 0;
    while (i.hasNext()) {
      String k = (String) i.next();
      h.get(k);
    }
  }

  void inefficient_loop_itr_heur_btw_bad_m(HashMap<String, Integer> l) {

    Set<String> m = l.keySet();
    int n = 0;
    int o = 1;
    int p = 3;
    Iterator q = m.iterator();
    while (q.hasNext()) {
      String r = (String) q.next();
      l.get(r);
    }
  }

  void efficient_loop_itr_ok_m(HashMap<String, Integer> s) {

    Iterator<Map.Entry<String, Integer>> t = s.entrySet().iterator();
    while (t.hasNext()) {
      Map.Entry<String, Integer> u = t.next();
      u.getKey();
      u.getValue();
    }
  }

  void efficient_loop_ok_m(HashMap<String, Integer> v) {
    for (Map.Entry<String, Integer> w : v.entrySet()) {
      w.getKey();
      w.getValue();
    }
  }

  void negative_loop_ok_m(HashMap<String, Integer> x1, HashMap<String, Integer> y1) {
    for (String z1 : x1.keySet()) {
      y1.get(z1);
    }
  }

  // Bundle doesn't implement Map hence have any entrySet
  public void from_bundle_ok_m(Bundle a1) {
    for (String b1 : a1.keySet()) {
      Object c1 = a1.get(b1);
    }
  }

  // ArrayMap extends SimpleMap.
  void inefficient_arraymap_loop_bad_m(ArrayMap<String, Integer> d1) {
    for (String e1 : d1.keySet()) {
      d1.get(e1);
    }
  }
}