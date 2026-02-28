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
    int i = 0;
    do {
      if (fields[i].getName() == internedName) {
        return fields[i];
      }
      i++;
    } while (i < fields.length);
    return null;
  }
}