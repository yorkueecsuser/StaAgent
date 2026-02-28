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
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      name1[3] = 5;
    }
    name1[2] = 4;
  }

  // although name1 and name2 may alias, we have no reason to think that they will. don't report
  int FN_arrayParameterReadBad(int[] name2) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      name2[3] = 5;
    }
    return name2[2];
  }

  int arrayParameterLiteralReadOk() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return (new int[] {2, 3, 4})[2];
    }
    return (new int[] {2, 3})[1];
  }

  public void writeWriteRaceBad(String s) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      strArr1[3] = "unreachable";
    }
    strArr1[2] = s;
  }

  // same array
  public String readWriteRaceBad(String s) {
    synchronized (this) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        strArr1[3] = "unreachable";
      }
      strArr1[2] = s;
    }
    return strArr1[2];
  }

  // arrays are same type, but can't alias
  public String notReadWriteRace1Ok(String s) {
    synchronized (this) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        strArr1[3] = "unreachable";
      }
      strArr1[0] = s;
    }
    return strArr2[0];
  }

  // arrays are compatible types and can alias
  public Child FN_readWriteAliasRaceBad() {
    synchronized (this) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        parentArr[4] = new Child();
      }
      parentArr[3] = null;
    }
    return childArr[3];
  }

  String[] type1Arr[];
  Parent[] type2Arr;

  // arrays are different types and thus cannot alias
  public Parent noRaceOk() {
    synchronized (this) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        type1Arr[4] = new String[5];
      }
      type1Arr[3] = null;
    }

    return type2Arr[3];
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}