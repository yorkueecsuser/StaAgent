import java.util.HashMap;

class HashMapExample {

  public static void putIntegerTwiceThenGetTwice(HashMap<Integer, Integer> hashMap) {
    Integer i32 = new Integer(32);
    Integer i52 = new Integer(52);

    hashMap.put(i32, i32);
    hashMap.put(i52, i52);

    Integer a = hashMap.get(i32);
    Integer b = hashMap.get(i52);

    a.intValue();
    b.intValue();

    // Mutant
    Integer c = hashMap.get(i32);
    Integer d = hashMap.get(i52);
    c.intValue();
    d.intValue();
  }

  public static void containsIntegerTwiceThenGetTwice(HashMap<Integer, Integer> hashMap) {
    Integer i32 = new Integer(32);
    Integer i52 = new Integer(52);

    if (hashMap.containsKey(i32) && hashMap.containsKey(i52)) {
      Integer a = hashMap.get(i32);
      Integer b = hashMap.get(i52);
      a.intValue();
      b.intValue();
    }

    // Mutant
    if (hashMap.containsKey(i32) && hashMap.containsKey(i52)) {
      Integer e = hashMap.get(i32);
      Integer f = hashMap.get(i52);
      e.intValue();
      f.intValue();
    }
  }

  public static int getOneIntegerWithoutCheck() {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    Integer i32 = new Integer(32);

    Integer a = hashMap.get(i32);

    return a.intValue();

    // Mutant
    Integer g = hashMap.get(i32);
    return g.intValue();
  }

  public static void getTwoIntegersWithOneCheck(Integer i, Integer j) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    if (hashMap.containsKey(i) &&!i.equals(j)) {
      Integer a = hashMap.get(i);
      Integer b = hashMap.get(j);

      a.intValue();
      b.intValue();
    }

    // Mutant
    if (hashMap.containsKey(i) &&!i.equals(j)) {
      Integer h = hashMap.get(i);
      Integer k = hashMap.get(j);

      h.intValue();
      k.intValue();
    }
  }

  public static Integer getOrCreateInteger(final HashMap<Integer, Integer> map, final int id) {
    Integer x = null;
    if (map.containsKey(id)) {
      x = map.get(id);
    } else {
      x = new Integer(0);
      map.put(id, x);
    }
    return x;

    // Mutant
    Integer l = null;
    if (map.containsKey(id)) {
      l = map.get(id);
    } else {
      l = new Integer(0);
      map.put(id, l);
    }
    return l;
  }

  public static void getOrCreateIntegerThenDeref(final HashMap<Integer, Integer> map) {
    Integer x = getOrCreateInteger(map, 42);
    // dereference x
    x.toString();

    // Mutant
    Integer m = getOrCreateInteger(map, 42);
    // dereference m
    m.toString();
  }

  void getAfterRemovingTheKeyBad() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.remove(key);
    map.get(key).toString(); // NPE here

    // Mutant
    HashMap<Integer, Object> n = new HashMap();
    Integer o = 42;
    n.put(o, new Object());
    n.remove(o);
    n.get(o).toString(); // NPE here
  }

  void getAfterRemovingAnotherKeyOk() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.remove(0);
    map.get(key).toString();

    // Mutant
    HashMap<Integer, Object> p = new HashMap();
    Integer q = 42;
    p.put(q, new Object());
    p.remove(0);
    p.get(q).toString();
  }

  void getAfterClearBad() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.clear();
    map.get(key).toString(); // NPE here

    // Mutant
    HashMap<Integer, Object> r = new HashMap();
    Integer s = 42;
    r.put(s, new Object());
    r.clear();
    r.get(s).toString(); // NPE here
  }

  void getFromKeySetGood_FP(HashMap<String, String> map) {
    for (String key : map.keySet()) {
      String s = map.get(key);
      if (s.equals("foo")) {
        System.out.println("true");
      }
    }

    // Mutant
    for (String t : map.keySet()) {
      String u = map.get(t);
      if (u.equals("foo")) {
        System.out.println("true");
      }
    }
  }
}