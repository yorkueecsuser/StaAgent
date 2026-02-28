import javax.annotation.Nullable;

/** Check how we model the behavior of Map nullability */
class MapNullability {

  class TestThatGetIsAllowedOnlyAfterContainsKeyWasChecked {

    void usingGetAfterKeyWasCheckedIsOK(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    void usingGetWithoutCheckingKeyIsBAD(java.util.Map<Integer, String> m) {
      m.get(3).isEmpty();
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    void usingGetAfterWrongKeyWasCheckedIsBAD(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    void usingGetAfterKeyWasCheckedInWhileLoopIsOK(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(3).isEmpty();
        }
      }
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    void usingGetAfterWrongKeyWasCheckedInWhileLoopIsBAD(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(4).isEmpty();
        }
      }
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    void immutableMap_usingGetAfterKeyWasCheckedIsOK(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    void immutableMap_usingGetAfterWrongKeyWasCheckedIsBAD(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }
  }

  class TestThatGetAfterPutIsAllowed {
    String dontAssignNull = "";

    public void getAfterPutIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      dontAssignNull = map.get(key);
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getWithoutPutIsBAD(java.util.Map<String, String> map, String key) {
      dontAssignNull = map.get(key);
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getAfterPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      map.put(key, "abc");
      dontAssignNull = map.get(wrongKey);
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
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
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getAfterPutSeveralKeysButGetWrongOneIsBAD(java.util.Map<String, String> map) {
      map.put("key1", "value1");
      map.put("key2", "value1");
      dontAssignNull = map.get("key2"); // OK
      dontAssignNull = map.get("wrong_key"); // BAD
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getAfterPutNonnullIsOK(java.util.Map<String, String> map, String nonnullValue) {
      map.put("key", nonnullValue);
      dontAssignNull = map.get("key");
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getAfterPutNullableIsBAD(
        java.util.Map<String, String> map, @Nullable String nullableValue) {
      map.put("key", nullableValue);
      dontAssignNull = map.get("key");
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void overwriteKeyByNullIsBAD(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      map.put(key, null); // Parameter not nullable
      dontAssignNull = map.get(key); // BAD
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void overwriteKeyByNonnullIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, null); // Parameter not nullable
      map.put(key, "abc");
      dontAssignNull = map.get(key); // OK
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getAfterConditionalPutIsOK(java.util.Map<String, String> map, String key) {
      if (!map.containsKey(key)) {
        map.put(key, "abc");
      }
      // OK: map either already contained a key, or we've just put it here!
      dontAssignNull = map.get(key);
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }

    public void getAfterConditionalPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      if (!map.containsKey(key)) {
        map.put(wrongKey, "abc");
      }
      dontAssignNull = map.get(key);
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}