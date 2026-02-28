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

    // New method: renamed method name to newEquals
    public boolean newEquals(Object o) {
        // Renamed method: changed return type to boolean
        return false;
    }

    // New method: renamed method name to newEqualsStr
    public boolean newEqualsStr(String s) {
        // Renamed method: changed method name to newEquals
        return false;
    }

    // New method: renamed method name to newEqualsObj
    public boolean newEqualsObj(Object o1, Object o2) {
        // Renamed method: changed method name to newEquals
        return false;
    }

    public void showNewBug() {
        newEquals(new Object());
        newEqualsStr("test");
        newEqualsObj(new Object(), new Object());
    }
}