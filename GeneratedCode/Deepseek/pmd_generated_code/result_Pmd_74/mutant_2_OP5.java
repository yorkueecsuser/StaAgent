// BUG: SuspiciousEqualsMethodName
class SuspiciousEqualsMethodName {
    private boolean condition = false;
    private int value = 0;

    public boolean equals(Object o) {
        // oops, this probably was supposed to be boolean equals
        return false;
    }

    public boolean equalsStr(String s) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    public boolean equalsObj(Object o1, Object o2) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());

        // Unreachable Switch Statement Mutation
        switch(value) {
            case 1:
                System.out.println("Unreachable Switch Statement");
                break;
            default:
                break;
        }
    }

    private int getValue() {
        return 0;
    }

    private boolean getCondition() {
        return false;
    }
}