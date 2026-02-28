class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            if (isUnreachableCondition()) {
                switch (getUnreachableValue()) {
                    case 1:
                        // Unreachable code
                        break;
                    default:
                        break;
                }
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    private boolean isUnreachableCondition() {
        return false;
    }

    private int getUnreachableValue() {
        return 0;
    }
}