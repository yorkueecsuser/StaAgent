class SuspiciousEqualsMethodName {
    public boolean equals(Object o) {
        while (false) {
            /* unreachable code */
        }
        return false;
    }

    public boolean equalsStr(String s) {
        while (false) {
            /* unreachable code */
        }
        return false;
    }

    public boolean equalsObj(Object o1, Object o2) {
        while (false) {
            /* unreachable code */
        }
        return false;
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());
    }
}