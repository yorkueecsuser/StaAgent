import java.lang.reflect.Field;

class StringComparision {
  int x, y;

  @Override
  public String toString() {
    return x + "," + y;
  }

  public boolean isOrigin() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return toString() == "0,0";
  }

  public boolean betterIsOrigin() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return toString().intern() == "0,0";
  }

  public boolean compareBool(Boolean a, Boolean b) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return a == b;
  }

  public boolean falsePositiveCompareBooleanToNull(Boolean a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return a == null;
  }

  public boolean falsePositiveCompareStringToNull(String a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return a == null;
  }

  public boolean falsePositiveCompareIntegerToNull(Integer a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return a == null;
  }

  public void compareTwo(String a, String b) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (a == "This") System.out.println("a");
    if (b == "That") System.out.println("b");
  }

  public Field searchFields(Field[] fields, String name) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    String internedName = name.intern();
    for (int i = 0; i < fields.length; i++) {
      if (fields[i].getName() == internedName) {
        return fields[i];
      }
    }
    return null;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}