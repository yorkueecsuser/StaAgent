class NullDeref3 {
  // A Null pointer bug from
  // Jakarta commons-modeler-1.1
  // org/apache/commons/modeler/util/IntrospectionUtils.java
  static boolean same1(int a[], int b[]) {
    if (a == null) if (b == null || b.length == 0) return true;
    if (b == null) if (a == null || a.length == 0) return true;
    // Bug is here. If one but not both of a & b are null,
    // we will get a null pointer exception
    if (a.length!= b.length) return false;
    return true;
  }

  // Mutant with renamed variable 'a' to 'x'
  static boolean same1Mutant(int x[], int b[]) {
    if (x == null) if (b == null || b.length == 0) return true;
    if (b == null) if (x == null || x.length == 0) return true;
    // Bug is here. If one but not both of a & b are null,
    // we will get a null pointer exception
    if (x.length!= b.length) return false;
    return true;
  }

  // A null pointer bug from commons-collection-2.1
  // org/apache/commons/collections/CollectionUtils.java
  static boolean same2(Object a, Object b) {
    if ((null == a && null == b) || a.equals(b)) return true;
    else return false;
  }

  // Mutant with renamed variable 'a' to 'c'
  static boolean same2Mutant(Object c, Object b) {
    if ((null == c && null == b) || c.equals(b)) return true;
    else return false;
  }

  // A variation of a null pointer bug from commons-collection-2.1
  // org/apache/commons/collections/CollectionUtils.java
  static boolean same3(Object a, Object b) {
    if ((a == null && b == null) || a.equals(b)) return true;
    else return false;
  }

  // Mutant with renamed variable 'b' to 'd'
  static boolean same3Mutant(Object a, Object d) {
    if ((a == null && d == null) || a.equals(d)) return true;
    else return false;
  }

  // A variation of a null pointer bug from commons-collection-2.1
  // org/apache/commons/collections/CollectionUtils.java
  static boolean same4(Object a, Object b) {
    if ((a == null && b == null) || b.equals(a)) return true;
    else return false;
  }

  // Mutant with renamed variable 'a' to 'e'
  static boolean same4Mutant(Object e, Object b) {
    if ((e == null && b == null) || b.equals(e)) return true;
    else return false;
  }
}