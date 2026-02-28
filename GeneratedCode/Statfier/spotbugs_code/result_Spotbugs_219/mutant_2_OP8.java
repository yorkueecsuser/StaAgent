import java.lang.reflect.Field;

class StringComparision {
  int x, y;

  @Override
  public String toString() {
    return x + "," + y;
  }

  public boolean isOrigin() {
    return toString() == "0,0";
  }

  public boolean betterIsOrigin() {
    return toString().intern() == "0,0";
  }

  public boolean compareBool(Boolean a, Boolean b) {
    return a == b;
  }

  public boolean falsePositiveCompareBooleanToNull(Boolean a) {
    return a == null;
  }

  public boolean falsePositiveCompareStringToNull(String a) {
    return a == null;
  }

  public boolean falsePositiveCompareIntegerToNull(Integer a) {
    return a == null;
  }

  public void compareTwo(String a, String b) {
    if (a == "This") System.out.println("a");
    if (b == "That") System.out.println("b");
  }

  public Field searchFields(Field[] fields, String name) {
    String internedName = name.intern();
    for (int i = 0; i < fields.length; i++) {
      if (fields[i].getName() == internedName) {
        return fields[i];
      }
    }
    return null;
  }

  // Mutated code
  public boolean mutatedIsOrigin() {
    int z = x;
    int w = y;
    return z + "," + w == "0,0";
  }

  public boolean mutatedBetterIsOrigin() {
    String s = toString().intern();
    return s == "0,0";
  }

  public boolean mutatedCompareBool(Boolean c, Boolean d) {
    return c == d;
  }

  public boolean mutatedFalsePositiveCompareBooleanToNull(Boolean e) {
    return e == null;
  }

  public boolean mutatedFalsePositiveCompareStringToNull(String f) {
    return f == null;
  }

  public boolean mutatedFalsePositiveCompareIntegerToNull(Integer g) {
    return g == null;
  }

  public void mutatedCompareTwo(String h, String i) {
    if (h == "This") System.out.println("a");
    if (i == "That") System.out.println("b");
  }

  public Field mutatedSearchFields(Field[] j, String k) {
    String l = k.intern();
    for (int m = 0; m < j.length; m++) {
      if (j[m].getName() == l) {
        return j[m];
      }
    }
    return null;
  }
}