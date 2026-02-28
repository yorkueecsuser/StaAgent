import java.util.HashMap;

class HashMapExample {

  public static void putIntegerTwiceThenGetTwice(HashMap<Integer, Integer> hashMap) {
    Integer i32 = new Integer(32);
    Integer i52 = new Integer(52);

    hashMap.put(i32, i32);
    hashMap.put(i52, i52);
    hashMap.put(i52, i52); // Mutant: duplicated assignment

    Integer a = hashMap.get(i32);
    Integer b = hashMap.get(i52);

    a.intValue();
    b.intValue();
  }

  public static void containsIntegerTwiceThenGetTwice(HashMap<Integer, Integer> hashMap) {
    Integer i32 = new Integer(32);
    Integer i52 = new Integer(52);

    if (hashMap.containsKey(i32) && hashMap.containsKey(i52)) {
      Integer a = hashMap.get(i32);
      Integer a2 = hashMap.get(i32); // Mutant: duplicated assignment
      Integer b = hashMap.get(i52);
      a.intValue();
      b.intValue();
    }
  }

  public static int getOneIntegerWithoutCheck() {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    Integer i32 = new Integer(32);

    Integer a = hashMap.get(i32);
    Integer a2 = hashMap.get(i32); // Mutant: duplicated assignment

    return a.intValue();
  }

  public static void getTwoIntegersWithOneCheck(Integer i, Integer j) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    if (hashMap.containsKey(i) &&!i.equals(j)) {
      Integer a = hashMap.get(i);
      Integer a2 = hashMap.get(i); // Mutant: duplicated assignment
      Integer b = hashMap.get(j);

      a.intValue();
      b.intValue();
    }
  }

  public static Integer getOrCreateInteger(final HashMap<Integer, Integer> map, final int id) {
    Integer x = null;
    if (map.containsKey(id)) {
      x = map.get(id);
      x = map.get(id); // Mutant: duplicated assignment
    } else {
      x = new Integer(0);
      map.put(id, x);
    }
    return x;
  }

  public static void getOrCreateIntegerThenDeref(final HashMap<Integer, Integer> map) {
    Integer x = getOrCreateInteger(map, 42);
    Integer x2 = getOrCreateInteger(map, 42); // Mutant: duplicated assignment
    // dereference x
    x.toString();
  }

  void getAfterRemovingTheKeyBad() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.remove(key);
    map.get(key).toString(); // NPE here
    map.get(key).toString(); // Mutant: duplicated assignment
  }

  void getAfterRemovingAnotherKeyOk() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.remove(0);
    map.get(key).toString();
    map.get(key).toString(); // Mutant: duplicated assignment
  }

  void getAfterClearBad() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.clear();
    map.get(key).toString(); // NPE here
    map.get(key).toString(); // Mutant: duplicated assignment
  }

  void getFromKeySetGood_FP(HashMap<String, String> map) {
    for (String key : map.keySet()) {
      String s = map.get(key);
      String s2 = map.get(key); // Mutant: duplicated assignment
      if (s.equals("foo")) {
        System.out.println("true");
      }
    }
  }
}