class ByteShiftBug {
    private int getValue() {
        return 0;  // always returns a value that makes the switch statement unreachable
    }

    public int showBug(byte b) {
        int shifted = b << 24; // original code

        // Mutant code: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
            default:
                break;
        }

        return shifted;
    }
}