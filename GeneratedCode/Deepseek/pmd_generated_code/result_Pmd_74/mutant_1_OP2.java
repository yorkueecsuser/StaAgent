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

    // Duplicated equals method
    public boolean equalsDuplicated(Object o) {
        // oops, this probably was supposed to be boolean equals
        return false;
    }

    // Duplicated equals method with different name
    public boolean equalsDuplicated2(String s) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Duplicated equals method with different name
    public boolean equalsDuplicated3(Object o1, Object o2) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }
}