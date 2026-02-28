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

    // Unreachable if statement mutation
    public void unreachableIfStatement() {
        // Non-final variable as condition
        boolean condition = false;
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    // Unreachable while loop mutation
    public void unreachableWhileLoop() {
        // Non-final variable as condition
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    // Unreachable for loop mutation
    public void unreachableForLoop() {
        // Non-final variable as condition
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    // Unreachable if-else statement mutation
    public void unreachableIfElseStatement() {
        // Non-final variable as condition
        boolean condition = false;
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    // Unreachable switch statement mutation
    public void unreachableSwitchStatement() {
        // Non-final variable as the switch value
        int value = 0;
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
    }
}