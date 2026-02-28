class NaNChecker {
    public boolean getCondition() {
        return false;
    }

    public boolean showBug(double x) {
        if (x == Double.NaN) {
            return true;
        }

        // Added mutant code
        int value = 1;
        boolean condition = getCondition();
        if (condition) {
            switch (value) {
                case 2:
                    System.out.println("This will never be printed.");
                    break;
            }
        }

        return false;
    }
}