class Foo {
    // BUG: SuspiciousEqualsMethodName - this method should return boolean, not int
    public int equals(Object o) {  // The bug is that this method returns 'int' instead of 'boolean'.
        return 0;
    }

    // BUG: SuspiciousEqualsMethodName - this method should override equals(Object), not overload it.
    public boolean equals(String s) {  // The bug is that this method overloads equals(Object) by taking a String parameter.
        return false;
    }

    // BUG: SuspiciousEqualsMethodName - this method should have only one parameter, not two.
    public boolean equals(Object o1, Object o2) {  boolean bpnsswbe = false;while (bpnsswbe && false && true && true && false && true && true && false && false && false && true && false) {boolean jomfqahk = false;}
  // The bug is that this method takes two parameters, although equals(Object) takes only one.
        return false;
    
}

    public int showBug1(Object o) {
        // Showing bug by returning int from equals:
        return equals(o);
    }

    public boolean showBug2(String s) {
        // Showing bug by overloading equals with String:
        return equals(s);
    }

    public boolean showBug3(Object o1, Object o2) {
        // Showing bug by having equals take two arguments:
        return equals(o1, o2);  // The bug is that this method calls equals(Object, Object) which does not exist.
    }
}