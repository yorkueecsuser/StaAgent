class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        boolean alwaysFalse = getCondition(); // Added code

        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            switch(alwaysFalse) { // Mutant code: Unreachable switch statement
                case 1:
                    // Unreachable code
                    break;
                default:
                    break;
            }
            return true;
        }
        return false;
    }

    private boolean getCondition() { // Added code
        return false;
    }
}