import java.util.Random;

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

    // Mutation: Adding unreachable switch statement
    public void addUnreachableSwitchStatement() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        switch (randomNumber) {
            case 0:
                System.out.println("Unreachable Switch Statement");
                break;
            default:
                // Unreachable code
                System.out.println("This line of code is unreachable");
                break;
        }
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());
        addUnreachableSwitchStatement();
    }
}