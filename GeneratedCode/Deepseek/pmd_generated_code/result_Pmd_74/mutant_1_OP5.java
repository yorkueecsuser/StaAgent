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

    // Mutation Operator name: Unreachable switch statement
    // Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable. 
    // Mutant Code:
    public void mutantMethod() {
        int value = 1; // non-final variable used as switch expression
        switch(value) {
            case 0: // unreachable case
            break;
            default:
            break;
        }
    }
}