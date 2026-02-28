import javax.annotation.Nullable;

/** Check how we model the behavior of Map nullability */
class MapNullability {

  class TestThatGetIsAllowedOnlyAfterContainsKeyWasChecked {

    void usingGetAfterKeyWasCheckedIsOK(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable loop
      }
    }

    void usingGetWithoutCheckingKeyIsBAD(java.util.Map<Integer, String> m) {
      m.get(3).isEmpty();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }

    void usingGetAfterWrongKeyWasCheckedIsBAD(java.util.Map<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
      boolean conditionIf = getCondition();
      if (conditionIf) {
        // Unreachable if block
      }
    }

    void usingGetAfterKeyWasCheckedInWhileLoopIsOK(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(3).isEmpty();
        }
      }
      boolean conditionSwitch = getCondition();
      switch (conditionSwitch) {
        case true:
          // Unreachable switch case
          break;
      }
    }

    void usingGetAfterWrongKeyWasCheckedInWhileLoopIsBAD(java.util.Map<Integer, String> m) {
      while (true) {
        if (m.containsKey(3)) {
          m.get(4).isEmpty();
        }
      }
      boolean conditionElse = getCondition();
      if (conditionElse) {
        // Unreachable if block
      } else {
        // Unreachable else block
      }
    }

    void immutableMap_usingGetAfterKeyWasCheckedIsOK(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(3).isEmpty();
      }
      boolean conditionDoWhile = getCondition();
      do {
        // Unreachable do-while loop
      } while (conditionDoWhile);
    }

    void immutableMap_usingGetAfterWrongKeyWasCheckedIsBAD(
        com.google.common.collect.ImmutableMap<Integer, String> m) {
      if (m.containsKey(3)) {
        m.get(4).isEmpty();
      }
      boolean conditionTryCatch = getCondition();
      try {
        if (conditionTryCatch) {
          // Unreachable if block
        }
      } catch (Exception e) {
        // Unreachable catch block
      }
    }
  }

  class TestThatGetAfterPutIsAllowed {
    String dontAssignNull = "";

    public void getAfterPutIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      dontAssignNull = map.get(key);
      boolean conditionFinally = getCondition();
      try {
        // Some code
      } finally {
        if (conditionFinally) {
          // Unreachable if block
        }
      }
    }

    public void getWithoutPutIsBAD(java.util.Map<String, String> map, String key) {
      dontAssignNull = map.get(key);
      boolean conditionAssert = getCondition();
      assert conditionAssert : "Unreachable assertion";
    }

    public void getAfterPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      map.put(key, "abc");
      dontAssignNull = map.get(wrongKey);
      boolean conditionSynchronized = getCondition();
      synchronized (this) {
        if (conditionSynchronized) {
          // Unreachable if block
        }
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
      boolean conditionLabel = getCondition();
      label:
      if (conditionLabel) {
        // Unreachable if block
      }
    }

    public void getAfterPutSeveralKeysButGetWrongOneIsBAD(java.util.Map<String, String> map) {
      map.put("key1", "value1");
      map.put("key2", "value1");
      dontAssignNull = map.get("key2"); // OK
      dontAssignNull = map.get("wrong_key"); // BAD
      boolean conditionLambda = getCondition();
      Runnable r = () -> {
        if (conditionLambda) {
          // Unreachable if block
        }
      };
    }

    public void getAfterPutNonnullIsOK(java.util.Map<String, String> map, String nonnullValue) {
      map.put("key", nonnullValue);
      dontAssignNull = map.get("key");
      boolean conditionMethodRef = getCondition();
      Runnable r = this::unreachableMethod;
      if (conditionMethodRef) {
        r.run();
      }
    }

    public void getAfterPutNullableIsBAD(
        java.util.Map<String, String> map, @Nullable String nullableValue) {
      map.put("key", nullableValue);
      dontAssignNull = map.get("key");
      boolean conditionArray = getCondition();
      int[] array = new int[0];
      for (int i : array) {
        if (conditionArray) {
          // Unreachable if block
        }
      }
    }

    public void overwriteKeyByNullIsBAD(java.util.Map<String, String> map, String key) {
      map.put(key, "abc");
      map.put(key, null); // Parameter not nullable
      dontAssignNull = map.get(key); // BAD
      boolean conditionStream = getCondition();
      array().stream().filter(x -> conditionStream).forEach(x -> {
        // Unreachable stream operation
      });
    }

    public void overwriteKeyByNonnullIsOK(java.util.Map<String, String> map, String key) {
      map.put(key, null); // Parameter not nullable
      map.put(key, "abc");
      dontAssignNull = map.get(key); // OK
      boolean conditionParallelStream = getCondition();
      array().parallelStream().filter(x -> conditionParallelStream).forEach(x -> {
        // Unreachable parallel stream operation
      });
    }

    public void getAfterConditionalPutIsOK(java.util.Map<String, String> map, String key) {
      if (!map.containsKey(key)) {
        map.put(key, "abc");
      }
      // OK: map either already contained a key, or we've just put it here!
      dontAssignNull = map.get(key);
      boolean conditionIntStream = getCondition();
      java.util.stream.IntStream.range(0, 0).filter(x -> conditionIntStream).forEach(x -> {
        // Unreachable int stream operation
      });
    }

    public void getAfterConditionalPutWrongKeyIsBAD(
        java.util.Map<String, String> map, String key, String wrongKey) {
      if (!map.containsKey(key)) {
        map.put(wrongKey, "abc");
      }
      dontAssignNull = map.get(key);
      boolean conditionLongStream = getCondition();
      java.util.stream.LongStream.range(0, 0).filter(x -> conditionLongStream).forEach(x -> {
        // Unreachable long stream operation
      });
    }

    private boolean getCondition() {
      return false;
    }

    private int[] array() {
      return new int[0];
    }

    private void unreachableMethod() {
      // Unreachable method
    }
  }
}