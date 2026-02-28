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
        // Mutant code: Unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
            }
        }
        return false;
    }
}