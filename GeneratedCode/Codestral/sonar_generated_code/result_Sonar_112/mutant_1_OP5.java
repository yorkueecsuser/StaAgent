class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        boolean condition = false;
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            int value = getValue();
            switch(value) {
                case 1:
                    // This case will never be reached because the value can never be 1
                    break;
            }
            if (condition) {
                // This block will also never be reached because condition is always false
            }
        }
        return arr;
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}