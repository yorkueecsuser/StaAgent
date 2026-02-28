class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) {
                // Original bug
                return -1;
            } else {
                // Unreachable switch statement
                boolean reachSwitch = false;
                if (reachSwitch) {
                    switch (negativeConstant) {
                        case 1:
                            System.out.println("This line will never execute.");
                            break;
                    }
                }
                return 1;
            }
        } else {
            return 0;
        }
    }
}