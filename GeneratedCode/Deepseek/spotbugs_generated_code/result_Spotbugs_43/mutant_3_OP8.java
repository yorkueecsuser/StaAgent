class DeadStoreSwitchFallthrough {
    public int showBug(int inputValue) {
        int res = 0;
        switch (inputValue) {
            case 1:
                res = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (inputValue!= 1) {
                    throw new RuntimeException("Unexpected input value");
                }
            default:
                res = -1;
        }
        return res;
    }
}