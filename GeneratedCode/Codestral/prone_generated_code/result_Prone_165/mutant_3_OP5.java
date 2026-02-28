class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            assert false : "Expected an exception";
            int unreachableValue = getValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    private int getValue() {
        return -1; // This will always return a value that does not match any case in the switch statement
    }
}