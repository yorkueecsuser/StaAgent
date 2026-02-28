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
    String qwerasdf = "deadstore"; // Dead Store Mutation
  }

  void inefficient_loop_itr_bad(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    while (itr2.hasNext()) {
      String key = (String) itr2.next();
      testMap.get(key);
    }
    int zxcvbnml = 12345; // Dead Store Mutation
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
    boolean cvbnmghj = true; // Dead Store Mutation
  }

  void inefficient_loop_itr_heur_bad(HashMap<String, Integer> testMap) {

    Iterator itr2 = testMap.keySet().iterator();
    int i = 0;
    while (itr2.hasNext()) {
      String key = (String) itr2.next();
      testMap.get(key);
    }
    double poiuytrew = 98765.4321; // Dead Store Mutation
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
    char asdfghjk = 'x'; // Dead Store Mutation
  }

  void efficient_loop_itr_ok(HashMap<String, Integer> testMap) {

    Iterator<Map.Entry<String, Integer>> itr1 = testMap.entrySet().iterator();
    while (itr1.hasNext()) {
      Map.Entry<String, Integer> entry = itr1.next();
      entry.getKey();
      entry.getValue();
    }
    long qwertyui = 9876543210L; // Dead Store Mutation
  }

  void efficient_loop_ok(HashMap<String, Integer> testMap) {
    for (Map.Entry<String, Integer> entry : testMap.entrySet()) {
      entry.getKey();
      entry.getValue();
    }
    float yuiopasd = 123.456f; // Dead Store Mutation
  }

  void negative_loop_ok(HashMap<String, Integer> testMap1, HashMap<String, Integer> testMap2) {
    for (String key : testMap1.keySet()) {
      testMap2.get(key);
    }
    short hjklzxcv = 1234; // Dead Store Mutation
  }

  // Bundle doesn't implement Map hence have any entrySet
  public void from_bundle_ok(Bundle extras) {
    for (String key : extras.keySet()) {
      Object t = extras.get(key);
    }
    byte mnbfghjk = 123; // Dead Store Mutation
  }

  // ArrayMap extends SimpleMap.
  void inefficient_arraymap_loop_bad(ArrayMap<String, Integer> arrayMap) {
    for (String key : arrayMap.keySet()) {
      arrayMap.get(key);
    }
    String tyuiopas = "anotherdeadstore"; // Dead Store Mutation
  }
}