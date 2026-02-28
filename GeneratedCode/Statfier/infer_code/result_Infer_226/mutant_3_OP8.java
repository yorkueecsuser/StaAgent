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

    // Mutant code
    void usingGetAfterKeyWasCheckedIsOKa(java.util.Map<Integer, String> a) {
      if (a.containsKey(3)) {
        a.get(3).isEmpty();
      }
    }

    void usingGetWithoutCheckingKeyIsBADb(java.util.Map<Integer, String> b) {
      b.get(3).isEmpty();
    }

    void usingGetAfterWrongKeyWasCheckedIsBADC(java.util.Map<Integer, String> c) {
      if (c.containsKey(3)) {
        c.get(4).isEmpty();
      }
    }

    void usingGetAfterKeyWasCheckedInWhileLoopIsOKd(java.util.Map<Integer, String> d) {
      while (true) {
        if (d.containsKey(3)) {
          d.get(3).isEmpty();
        }
      }
    }

    void usingGetAfterWrongKeyWasCheckedInWhileLoopIsBAd(java.util.Map<Integer, String> e) {
      while (true) {
        if (e.containsKey(3)) {
          e.get(4).isEmpty();
        }
      }
    }

    void immutableMap_usingGetAfterKeyWasCheckedIsOKf(
        com.google.common.collect.ImmutableMap<Integer, String> f) {
      if (f.containsKey(3)) {
        f.get(3).isEmpty();
      }
    }

    void immutableMap_usingGetAfterWrongKeyWasCheckedIsBADg(
        com.google.common.collect.ImmutableMap<Integer, String> g) {
      if (g.containsKey(3)) {
        g.get(4).isEmpty();
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

    // Mutant code
    public void getAfterPutIsOKh(java.util.Map<String, String> h, String i) {
      h.put(i, "abc");
      dontAssignNull = h.get(i);
    }

    public void getWithoutPutIsBADj(java.util.Map<String, String> j, String k) {
      dontAssignNull = j.get(k);
    }

    public void getAfterPutWrongKeyIsBADl(
        java.util.Map<String, String> l, String m, String n) {
      l.put(m, "abc");
      dontAssignNull = l.get(n);
    }

    public void getAfterPutSeveralKeysIsOKo(java.util.Map<String, String> o) {
      o.put("key1", "value1");
      o.put("key2", "value1");
      dontAssignNull = o.get("key2");
      dontAssignNull = o.get("key1");
      dontAssignNull = o.get("key2");
      o.put("key3", "value1");
      dontAssignNull = o.get("key1");
      dontAssignNull = o.get("key2");
      dontAssignNull = o.get("key3");
    }

    public void getAfterPutSeveralKeysButGetWrongOneIsBADp(java.util.Map<String, String> p) {
      p.put("key1", "value1");
      p.put("key2", "value1");
      dontAssignNull = p.get("key2"); // OK
      dontAssignNull = p.get("wrong_key"); // BAD
    }

    public void getAfterPutNonnullIsOKq(java.util.Map<String, String> q, String r) {
      q.put("key", r);
      dontAssignNull = q.get("key");
    }

    public void getAfterPutNullableIsBADs(
        java.util.Map<String, String> s, @Nullable String t) {
      s.put("key", t);
      dontAssignNull = s.get("key");
    }

    public void overwriteKeyByNullIsBADu(java.util.Map<String, String> u, String v) {
      u.put(v, "abc");
      u.put(v, null); // Parameter not nullable
      dontAssignNull = u.get(v); // BAD
    }

    public void overwriteKeyByNonnullIsOKw(java.util.Map<String, String> w, String x) {
      w.put(x, null); // Parameter not nullable
      w.put(x, "abc");
      dontAssignNull = w.get(x); // OK
    }

    public void getAfterConditionalPutIsOKy(java.util.Map<String, String> y, String z) {
      if (!y.containsKey(z)) {
        y.put(z, "abc");
      }
      // OK: map either already contained a key, or we've just put it here!
      dontAssignNull = y.get(z);
    }

    public void getAfterConditionalPutWrongKeyIsBADaa(
        java.util.Map<String, String> aa, String bb, String cc) {
      if (!aa.containsKey(bb)) {
        aa.put(cc, "abc");
      }
      dontAssignNull = aa.get(bb);
    }
  }
}