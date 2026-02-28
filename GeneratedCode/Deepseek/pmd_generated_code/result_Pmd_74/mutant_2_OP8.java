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

    // Mutated method: renamed method name to equalsX
    public boolean equalsX(Object o) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Mutated method: renamed method name to equalsStrX
    public boolean equalsStrX(String s) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Mutated method: renamed method name to equalsObjX
    public boolean equalsObjX(Object o1, Object o2) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());

        // Mutated method calls: renamed method names to equalsX, equalsStrX, equalsObjX
        equalsX(new Object());
        equalsStrX("test");
        equalsObjX(new Object(), new Object());
    }
}