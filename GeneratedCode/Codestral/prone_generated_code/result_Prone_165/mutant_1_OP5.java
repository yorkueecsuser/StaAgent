class TryFailThrowableBug {
    private boolean alwaysFalse() {
        return false;
    }

    public boolean showBug(int number) {
        try {
            int value = number; // Just to have a variable for the switch condition
            switch (value) {
                case 1:
                    // Unreachable code
                    break;
            }

            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }

            if (alwaysFalse()) {
                // Unreachable code
                assert false : "Expected an exception";
            }
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}