class IdenticalExpressionsBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int a, int b) {
        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }
        if (getUnreachableCondition()) { // Unreachable if statement - Mutant
            // This block of code is unreachable
            System.out.println("Unreachable code executed!");
        }
        return false;
    }
}