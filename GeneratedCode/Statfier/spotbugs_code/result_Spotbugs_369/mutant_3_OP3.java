class NullDeref3 {
  // A Null pointer bug from
  // Jakarta commons-modeler-1.1
  // org/apache/commons/modeler/util/IntrospectionUtils.java
  static boolean same1(int a[], int b[]) {
    if (a == null) if (b == null || b.length == 0) return true;
    if (b == null) if (a == null || a.length == 0) return true;
    // Bug is here. If one but not both of a & b are null,
    // we will get a null pointer exception
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    if (a.length!= b.length) return false;
    return true;
  }

  // A null pointer bug from commons-collection-2.1
  // org/apache/commons/collections/CollectionUtils.java
  static boolean same2(Object a, Object b) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    if ((null == a && null == b) || a.equals(b)) return true;
    else return false;
  }

  // A variation of a null pointer bug from commons-collection-2.1
  // org/apache/commons/collections/CollectionUtils.java
  static boolean same3(Object a, Object b) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    if ((a == null && b == null) || a.equals(b)) return true;
    else return false;
  }

  // A variation of a null pointer bug from commons-collection-2.1
  // org/apache/commons/collections/CollectionUtils.java
  static boolean same4(Object a, Object b) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    if ((a == null && b == null) || b.equals(a)) return true;
    else return false;
  }

  // Method to provide a dynamic condition for unreachable if statements
  private static boolean getCondition() {
    return false;
  }
}