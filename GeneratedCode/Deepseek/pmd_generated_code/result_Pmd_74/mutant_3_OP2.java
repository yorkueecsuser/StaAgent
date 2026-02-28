class SuspiciousEqualsMethodName {
    public boolean equals(Object o) {
        // oops, this probably was supposed to be boolean equals
        return false;
    }

    public boolean equalsStr(String s) {
        // Duplicated line
        return false;

        // Duplicated line
        return false;
    }

    public boolean equalsObj(Object o1, Object o2) {
        // Duplicated line
        return false;

        // Duplicated line
        return false;
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());
    }
}