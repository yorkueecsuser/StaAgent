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
    Map<Sex, Sex> b = new HashMap<Sex, Sex>();
    b.put(Sex.MALE, Sex.FEMALE);
    b.put(Sex.FEMALE, Sex.MALE);
    Set<Map.Entry<Sex, Sex>> c = new HashSet<Map.Entry<Sex, Sex>>(b.entrySet());
    System.out.print(c.size() + " ");
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
    EnumMap<Sex, Sex> d = new EnumMap<Sex, Sex>(Sex.class);
    d.put(Sex.MALE, Sex.FEMALE);
    d.put(Sex.FEMALE, Sex.MALE);
    Set<Map.Entry<Sex, Sex>> e = new HashSet<Map.Entry<Sex, Sex>>(d.entrySet());
    System.out.print(e.size() + " ");
    Set<Map.Entry<Sex, Sex>> f = new HashSet<Map.Entry<Sex, Sex>>();
    f.addAll(d.entrySet());
    System.out.print(f.size() + " ");
  }
}