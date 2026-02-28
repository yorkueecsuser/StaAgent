import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class inefficientKeysetIterator {

  void inefficient_loop_bad(HashMap<String, Integer> testMap) {
    Iterator<String> itr = testMap.keySet().iterator();
    do {
      String key = itr.next();
      testMap.get(key);
    } while (itr.hasNext());
  }

  void inefficient_loop_itr_bad(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    do {
      String key = (String) itr2.next();
      testMap.get(key);
    } while (itr2.hasNext());
  }

  void inefficient_loop_itr_heur_bad_FN(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    int i = 0;
    int j = 1;
    int k = 2;
    int l = 3;
    do {
      String key = (String) itr2.next();
      testMap.get(key);
    } while (itr2.hasNext());
  }

  void inefficient_loop_itr_heur_bad(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    int i = 0;
    do {
      String key = (String) itr2.next();
      testMap.get(key);
    } while (itr2.hasNext());
  }

  void inefficient_loop_itr_heur_btw_bad(HashMap<String, Integer> testMap) {

    Set<String> keySet = testMap.keySet();
    int i = 0;
    int j = 1;
    int l = 3;
    Iterator itr2 = keySet.iterator();
    do {
      String key = (String) itr2.next();
      testMap.get(key);
    } while (itr2.hasNext());
  }

  void efficient_loop_itr_ok(HashMap<String, Integer> testMap) {

    Iterator<Map.Entry<String, Integer>> itr1 = testMap.entrySet().iterator();
    do {
      Map.Entry<String, Integer> entry = itr1.next();
      entry.getKey();
      entry.getValue();
    } while (itr1.hasNext());
  }

  void efficient_loop_ok(HashMap<String, Integer> testMap) {
    Iterator<Map.Entry<String, Integer>> itr = testMap.entrySet().iterator();
    do {
      Map.Entry<String, Integer> entry = itr.next();
      entry.getKey();
      entry.getValue();
    } while (itr.hasNext());
  }

  void negative_loop_ok(HashMap<String, Integer> testMap1, HashMap<String, Integer> testMap2) {
    Iterator<String> itr = testMap1.keySet().iterator();
    do {
      String key = itr.next();
      testMap2.get(key);
    } while (itr.hasNext());
  }

  // Bundle doesn't implement Map hence have any entrySet
  public void from_bundle_ok(Bundle extras) {
    Iterator<String> itr = extras.keySet().iterator();
    do {
      String key = itr.next();
      Object t = extras.get(key);
    } while (itr.hasNext());
  }

  // ArrayMap extends SimpleMap.
  void inefficient_arraymap_loop_bad(ArrayMap<String, Integer> arrayMap) {
    Iterator<String> itr = arrayMap.keySet().iterator();
    do {
      String key = itr.next();
      arrayMap.get(key);
    } while (itr.hasNext());
  }
}