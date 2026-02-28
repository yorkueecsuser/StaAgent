class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }

    private static boolean shouldRun() {
        return false;
    }

    public static void mutant() {
        boolean condition = getCondition();
        int value = getValue();
        boolean shouldRun = shouldRun();

        if (condition) {
            if (value == 1) {
                /* code */
            } else {
                /* alternative code */
            }
        } else {
            while (true) {
                /* code */
            }
        }

        for (int i = 0; i < 10; i++) {
            /* code */
        }

        switch (value) {
            case 1:
                /* code */
                break;
            default:
                /* code */
        }
    }
}