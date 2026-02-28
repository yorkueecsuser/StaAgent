class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;
        switch (input) {
            case 1:
                result = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                int deadStore = 42;  // Dead store inserted here
                if (input!= 1) {
                    throw new RuntimeException("Unexpected input value");
                }
            default:
                result = -1;
        }
        return result;
    }
}