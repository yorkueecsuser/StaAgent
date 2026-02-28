class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;

        // Inserting unreachable switch statement
        boolean alwaysFalse = getCondition();
        if(alwaysFalse) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code block");
                    break;
            }
        }

        return shifted;
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    private int getValue() {
        // This method returns a value that will never match case 1 in the switch statement
        return 2;
    }
}