class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            int value = getValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    result = 3;
                    break;
            }
        } else {
            result = 2;
        }
        return result;
    }

    private int getValue() {
        // Always return a value that is not 1 to make the switch statement unreachable
        return 2;
    }
}