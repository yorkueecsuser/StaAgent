// BUG: SuspiciousEqualsMethodName
class SuspiciousEqualsMethodName {
    // Fixed method: changed return type to boolean
    public boolean equals(Object o) {
        // oops, this probably was supposed to be boolean equals
        return false;
    }

    // Fixed method: changed method name to equals
    public boolean equalsStr(String s) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Fixed method: changed method name to equals
    public boolean equalsObj(Object o1, Object o2) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());
    }

    // Mutated method: duplicating equals(Object o) method
    public boolean equalsObjDuplicated(Object o) {
        return false;
    }

    // Mutated method: duplicating equalsStr(String s) method
    public boolean equalsStrDuplicated(String s) {
        return false;
    }

    // Mutated method: duplicating equalsObj(Object o1, Object o2) method
    public boolean equalsObj2Duplicated(Object o1, Object o2) {
        return false;
    }

    public void showMutant() {
        equalsObjDuplicated(new Object());
        equalsStrDuplicated("test");
        equalsObj2Duplicated(new Object(), new Object());
    }
}