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

    // Dead Store Mutation
    int qzjfnvxy = 42;
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

    // Dead Store Mutation
    String yxwvutrs = "deadstore";
  }

  public static int getOneIntegerWithoutCheck() {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    Integer i32 = new Integer(32);

    Integer a = hashMap.get(i32);

    return a.intValue();

    // Dead Store Mutation
    double wqetlkjn = 3.14;
  }

  public static void getTwoIntegersWithOneCheck(Integer i, Integer j) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    if (hashMap.containsKey(i) &&!i.equals(j)) {
      Integer a = hashMap.get(i);
      Integer b = hashMap.get(j);

      a.intValue();
      b.intValue();
    }

    // Dead Store Mutation
    char ghtyujmn = 'a';
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

    // Dead Store Mutation
    boolean fghjklpo = true;
  }

  public static void getOrCreateIntegerThenDeref(final HashMap<Integer, Integer> map) {
    Integer x = getOrCreateInteger(map, 42);
    // dereference x
    x.toString();

    // Dead Store Mutation
    float lkjhgfds = 2.71f;
  }

  void getAfterRemovingTheKeyBad() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.remove(key);
    map.get(key).toString(); // NPE here

    // Dead Store Mutation
    long asdfghjk = 987654321L;
  }

  void getAfterRemovingAnotherKeyOk() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.remove(0);
    map.get(key).toString();

    // Dead Store Mutation
    short zxcvbnml = 12345;
  }

  void getAfterClearBad() {
    HashMap<Integer, Object> map = new HashMap();
    Integer key = 42;
    map.put(key, new Object());
    map.clear();
    map.get(key).toString(); // NPE here

    // Dead Store Mutation
    byte poiuytrewq = 127;
  }

  void getFromKeySetGood_FP(HashMap<String, String> map) {
    for (String key : map.keySet()) {
      String s = map.get(key);
      if (s.equals("foo")) {
        System.out.println("true");
      }
    }

    // Dead Store Mutation
    int edcfvgyb = 88;
  }
}