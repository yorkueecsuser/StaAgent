import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Puzzlers2010 {

  static enum Sex {
    MALE,
    FEMALE
  }

  public static void main(String[] args) {
    printSize(new HashMap<Sex, Sex>());
    printSize(new EnumMap<Sex, Sex>(Sex.class));
    printSize2(new EnumMap<Sex, Sex>(Sex.class));
  }

  private static void printSize(Map<Sex, Sex> map) {
    map.put(Sex.MALE, Sex.FEMALE);
    map.put(Sex.FEMALE, Sex.MALE);
    Set<Map.Entry<Sex, Sex>> set = new HashSet<Map.Entry<Sex, Sex>>(map.entrySet());
    System.out.print(set.size() + " ");

    // Mutant code
    Map<Sex, Sex> m = new HashMap<Sex, Sex>();
    m.put(Sex.MALE, Sex.FEMALE);
    m.put(Sex.FEMALE, Sex.MALE);
    Set<Map.Entry<Sex, Sex>> s = new HashSet<Map.Entry<Sex, Sex>>(m.entrySet());
    System.out.print(s.size() + " ");
  }

  private static void printSize2(EnumMap<Sex, Sex> map) {
    map.put(Sex.MALE, Sex.FEMALE);
    map.put(Sex.FEMALE, Sex.MALE);
    Set<Map.Entry<Sex, Sex>> set = new HashSet<Map.Entry<Sex, Sex>>(map.entrySet());
    System.out.print(set.size() + " ");
    Set<Map.Entry<Sex, Sex>> set2 = new HashSet<Map.Entry<Sex, Sex>>();
    set2.addAll(map.entrySet());
    System.out.print(set2.size() + " ");

    // Mutant code
    EnumMap<Sex, Sex> e = new EnumMap<Sex, Sex>(Sex.class);
    e.put(Sex.MALE, Sex.FEMALE);
    e.put(Sex.FEMALE, Sex.MALE);
    Set<Map.Entry<Sex, Sex>> t = new HashSet<Map.Entry<Sex, Sex>>(e.entrySet());
    System.out.print(t.size() + " ");
    Set<Map.Entry<Sex, Sex>> u = new HashSet<Map.Entry<Sex, Sex>>();
    u.addAll(e.entrySet());
    System.out.print(u.size() + " ");
  }
}