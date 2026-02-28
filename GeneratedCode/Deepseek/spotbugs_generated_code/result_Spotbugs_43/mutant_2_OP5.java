class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;

        // Added unreachable switch statement
        switch (-1) {
            case 1:
                // This case is unreachable
                result = 20;
                break;
            default:
                // This case is unreachable
                result = -2;
        }

        switch (input) {
            case 1:
                result = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    throw new RuntimeException("Unexpected input value");
                }
            default:
                result = -1;
        }
        return result;
    }
}