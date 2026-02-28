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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition? 0 : 1 will always be 1
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false;
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
}