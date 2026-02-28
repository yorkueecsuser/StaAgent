class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) {
                return -1;
            } else {
                // Unreachable switch statement
                switch (getFalseCondition()) {
                    case 1:
                        System.out.println("Unreachable code");
                        break;
                }
                return 1;
            }
        } else {
            return 0;
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}