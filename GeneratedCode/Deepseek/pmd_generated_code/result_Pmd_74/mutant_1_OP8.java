class SuspiciousEqualsMethodName {
    public boolean equals(Object o) {
        return false;
    }

    // Renamed method: equalsStr to equals
    public boolean equals(String s) {
        return false;
    }

    // Renamed method: equalsObj to equals
    public boolean equals(Object o1, Object o2) {
        return false;
    }

    public void showBug() {
        equals(new Object());
        equals("test");
        equals(new Object(), new Object());
    }
}