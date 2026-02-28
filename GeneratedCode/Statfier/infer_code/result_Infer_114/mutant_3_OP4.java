import javax.annotation.concurrent.ThreadSafe;

// Test may_alias treatment of arrays
// two arrays of types in a subtype relation may alias, and race

@ThreadSafe
class Parent {}

@ThreadSafe
class Child extends Parent {}

@ThreadSafe
class Arrays {
  Child[] childArr = new Child[5];
  Parent[] parentArr = childArr; // actual aliasing not required, but for documentation
  final String[] strArr1 = new String[5];
  final String[] strArr2 = new String[5];

  void arrayParameterWriteBad(int[] name1) {
    name1[2] = 4;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      name1[1] = 5;
    } else {
      // Another unreachable code
      name1[0] = 6;
    }
  }

  // although name1 and name2 may alias, we have no reason to think that they will. don't report
  int FN_arrayParameterReadBad(int[] name2) {
    return name2[2];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return name2[1];
    } else {
      // Another unreachable code
      return name2[0];
    }
  }

  int arrayParameterLiteralReadOk() {
    return (new int[] {2, 3})[1];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return (new int[] {4, 5})[1];
    } else {
      // Another unreachable code
      return (new int[] {6, 7})[1];
    }
  }

  public void writeWriteRaceBad(String s) {
    strArr1[2] = s;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      strArr1[1] = s;
    } else {
      // Another unreachable code
      strArr1[0] = s;
    }
  }

  // same array
  public String readWriteRaceBad(String s) {
    synchronized (this) {
      strArr1[2] = s;
    }
    return strArr1[2];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return strArr1[1];
    } else {
      // Another unreachable code
      return strArr1[0];
    }
  }

  // arrays are same type, but can't alias
  public String notReadWriteRace1Ok(String s) {
    synchronized (this) {
      strArr1[0] = s;
    }
    return strArr2[0];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return strArr1[1];
    } else {
      // Another unreachable code
      return strArr1[0];
    }
  }

  // arrays are compatible types and can alias
  public Child FN_readWriteAliasRaceBad() {
    synchronized (this) {
      parentArr[3] = null;
    }
    return childArr[3];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return childArr[2];
    } else {
      // Another unreachable code
      return childArr[1];
    }
  }

  String[] type1Arr[];
  Parent[] type2Arr;

  // arrays are different types and thus cannot alias
  public Parent noRaceOk() {
    synchronized (this) {
      type1Arr[3] = null;
    }

    return type2Arr[3];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return type2Arr[2];
    } else {
      // Another unreachable code
      return type2Arr[1];
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
  }
}