import javax.annotation.Nullable;

/** Check how we model the behavior of Map nullability */
class MapNullability {

  class TestThatGetIsAllowedOnlyAfterContainsKeyWasChecked {

    void usingGetAfterKeyWasCheckedIsOK(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
    }

    void usingGetWithoutCheckingKeyIsBAD(java.util.Map<Integer, String> m) {
      m.get(3).isEmpty();
    }

    void usingGetAfterWrongKeyWasCheckedIsBAD(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
    }

    void usingGetAfterKeyWasCheckedInWhileLoopIsOK(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(3).isEmpty();
        }
      }
    }

    void usingGetAfterWrongKeyWasCheckedInWhileLoopIsBAD(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(4).isEmpty();
        }
      }
    }

    void immutableMap_usingGetAfterKeyWasCheckedIsOK(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
    }

    void immutableMap_usingGetAfterWrongKeyWasCheckedIsBAD(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
    }
  }

  class TestThatGetAfterPutIsAllowed {
    String dontAssignNull = "";

    public void getAfterPutIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      dontAssignNull = map.get(key);
    }

    public void getWithoutPutIsBAD(java.util.Map<String, String> map, String key) {
      dontAssignNull = map.get(key);
    }

    public void getAfterPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      map.put(key, "abc");
      dontAssignNull = map.get(wrongKey);
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
    }

    public void getAfterPutSeveralKeysButGetWrongOneIsBAD(java.util.Map<String, String> map) {
      map.put("key1", "value1");
      map.put("key2", "value1");
      dontAssignNull = map.get("key2"); // OK
      dontAssignNull = map.get("wrong_key"); // BAD
    }

    public void getAfterPutNonnullIsOK(java.util.Map<String, String> map, String nonnullValue) {
      map.put("key", nonnullValue);
      dontAssignNull = map.get("key");
    }

    public void getAfterPutNullableIsBAD(
        java.util.Map<String, String> map, @Nullable String nullableValue) {
      map.put("key", nullableValue);
      dontAssignNull = map.get("key");
    }

    public void overwriteKeyByNullIsBAD(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      map.put(key, null); // Parameter not nullable
      dontAssignNull = map.get(key); // BAD
    }

    public void overwriteKeyByNonnullIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, null); // Parameter not nullable
      map.put(key, "abc");
      dontAssignNull = map.get(key); // OK
    }

    public void getAfterConditionalPutIsOK(java.util.Map<String, String> map, String key) {
      if (!map.containsKey(key)) {
        map.put(key, "abc");
      }
      // OK: map either already contained a key, or we've just put it here!
      dontAssignNull = map.get(key);
    }

    public void getAfterConditionalPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      if (!map.containsKey(key)) {
        map.put(wrongKey, "abc");
      }
      dontAssignNull = map.get(key);
    }

    // Mutated code
    public void getAfterPutIsOK_mutated(java.util.Map<String, String> a, String b) {
      a.put(b, "abc");
      dontAssignNull = a.get(b);
    }

    public void getWithoutPutIsBAD_mutated(java.util.Map<String, String> c, String d) {
      dontAssignNull = c.get(d);
    }

    public void getAfterPutWrongKeyIsBAD_mutated(
        java.util.Map<String, String> e, String f, String g) {
      e.put(f, "abc");
      dontAssignNull = e.get(g);
    }

    public void getAfterPutSeveralKeysIsOK_mutated(java.util.Map<String, String> h) {
      h.put("key1", "value1");
      h.put("key2", "value1");
      dontAssignNull = h.get("key2");
      dontAssignNull = h.get("key1");
      dontAssignNull = h.get("key2");
      h.put("key3", "value1");
      dontAssignNull = h.get("key1");
      dontAssignNull = h.get("key2");
      dontAssignNull = h.get("key3");
    }

    public void getAfterPutSeveralKeysButGetWrongOneIsBAD_mutated(java.util.Map<String, String> i) {
      i.put("key1", "value1");
      i.put("key2", "value1");
      dontAssignNull = i.get("key2"); // OK
      dontAssignNull = i.get("wrong_key"); // BAD
    }

    public void getAfterPutNonnullIsOK_mutated(java.util.Map<String, String> j, String k) {
      j.put("key", k);
      dontAssignNull = j.get("key");
    }

    public void getAfterPutNullableIsBAD_mutated(
        java.util.Map<String, String> l, @Nullable String m) {
      l.put("key", m);
      dontAssignNull = l.get("key");
    }

    public void overwriteKeyByNullIsBAD_mutated(java.util.Map<String, String> n, String o) {
      n.put(o, "abc");
      n.put(o, null); // Parameter not nullable
      dontAssignNull = n.get(o); // BAD
    }

    public void overwriteKeyByNonnullIsOK_mutated(java.util.Map<String, String> p, String q) {
      p.put(q, null); // Parameter not nullable
      p.put(q, "abc");
      dontAssignNull = p.get(q); // OK
    }

    public void getAfterConditionalPutIsOK_mutated(java.util.Map<String, String> r, String s) {
      if (!r.containsKey(s)) {
        r.put(s, "abc");
      }
      // OK: map either already contained a key, or we've just put it here!
      dontAssignNull = r.get(s);
    }

    public void getAfterConditionalPutWrongKeyIsBAD_mutated(
        java.util.Map<String, String> t, String u, String v) {
      if (!t.containsKey(u)) {
        t.put(v, "abc");
      }
      dontAssignNull = t.get(u);
    }
  }
}