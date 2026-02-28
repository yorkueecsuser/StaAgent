import javax.annotation.Nullable;

/** Check how we model the behavior of Map nullability */
class MapNullability {

  class TestThatGetIsAllowedOnlyAfterContainsKeyWasChecked {

    void usingGetAfterKeyWasCheckedIsOK(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
      String qwertyui = "unused"; // Dead store
    }

    void usingGetWithoutCheckingKeyIsBAD(java.util.Map<Integer, String> m) {
      m.get(3).isEmpty();
      int asdfghjk = 42; // Dead store
    }

    void usingGetAfterWrongKeyWasCheckedIsBAD(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
      boolean zxcvbnml = true; // Dead store
    }

    void usingGetAfterKeyWasCheckedInWhileLoopIsOK(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(3).isEmpty();
        }
      }
      double poiuytrew = 3.14; // Dead store
    }

    void usingGetAfterWrongKeyWasCheckedInWhileLoopIsBAD(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(4).isEmpty();
        }
      }
      char lkjhgfdsa = 'x'; // Dead store
    }

    void immutableMap_usingGetAfterKeyWasCheckedIsOK(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
      float mnbvcxz = 2.71f; // Dead store
    }

    void immutableMap_usingGetAfterWrongKeyWasCheckedIsBAD(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
      long vbnmklpoi = 123456789L; // Dead store
    }
  }

  class TestThatGetAfterPutIsAllowed {
    String dontAssignNull = "";

    public void getAfterPutIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      dontAssignNull = map.get(key);
      short hjklzxcv = 10; // Dead store
    }

    public void getWithoutPutIsBAD(java.util.Map<String, String> map, String key) {
      dontAssignNull = map.get(key);
      byte rtyuiop = 1; // Dead store
    }

    public void getAfterPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      map.put(key, "abc");
      dontAssignNull = map.get(wrongKey);
      String edcfvgbhnj = "another unused"; // Dead store
    }

    public void getAfterPutSeveralKeysIsOK(java.util.Map<String, String> map) {
      map.put("key1", "value1");
      map.put("key2", "value1");
      dontAssignNull = map.get("key2");
      dontAssignNull = map.get("key1");
      dontAssignNull = map.get("key2");
      map.put("key3", "value1");
      dontAssignNull = map.get("key1");
      dontAssignNull = map.get("key2");
      dontAssignNull = map.get("key3");
      char tyuiohgf = 'y'; // Dead store
    }

    public void getAfterPutSeveralKeysButGetWrongOneIsBAD(java.util.Map<String, String> map) {
      map.put("key1", "value1");
      map.put("key2", "value1");
      dontAssignNull = map.get("key2"); // OK
      dontAssignNull = map.get("wrong_key"); // BAD
      long poiuytrewq = 987654321L; // Dead store
    }

    public void getAfterPutNonnullIsOK(java.util.Map<String, String> map, String nonnullValue) {
      map.put("key", nonnullValue);
      dontAssignNull = map.get("key");
      double lkjhgfdsaz = 0.577; // Dead store
    }

    public void getAfterPutNullableIsBAD(
        java.util.Map<String, String> map, @Nullable String nullableValue) {
      map.put("key", nullableValue);
      dontAssignNull = map.get("key");
      float asdfghjklz = 1.618f; // Dead store
    }

    public void overwriteKeyByNullIsBAD(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      map.put(key, null); // Parameter not nullable
      dontAssignNull = map.get(key); // BAD
      boolean cvbnmlop = false; // Dead store
    }

    public void overwriteKeyByNonnullIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, null); // Parameter not nullable
      map.put(key, "abc");
      dontAssignNull = map.get(key); // OK
      int qwertyuiop = 42; // Dead store
    }

    public void getAfterConditionalPutIsOK(java.util.Map<String, String> map, String key) {
      if (!map.containsKey(key)) {
        map.put(key, "abc");
      }
      // OK: map either already contained a key, or we've just put it here!
      dontAssignNull = map.get(key);
      char mnbvcxzlkj = 'z'; // Dead store
    }

    public void getAfterConditionalPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      if (!map.containsKey(key)) {
        map.put(wrongKey, "abc");
      }
      dontAssignNull = map.get(key);
      String hgfdsapoiuyt = "yet another unused"; // Dead store
    }
  }
}