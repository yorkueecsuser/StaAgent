class SuspiciousEqualsMethodName {
    public boolean equals(Object o) {
        return false;
    }

    public boolean equalsStr(String s) {
        return false;
    }

    public boolean equalsObj(Object o1, Object o2) {
        return false;
    }

    public void showBug() {
        if (false) {
            // unreachable code
            equals(new Object());
        }
        if (false) {
            // unreachable code
            equalsStr("test");
        }
        if (false) {
            // unreachable code
            equalsObj(new Object(), new Object());
        }
    }
}