// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int value = getValue();
        switch(value) {
            case 1:
                // This code is unreachable because getValue() never returns 1
                System.out.println("Unreachable code");
                break;
        }
        return x + y;
    }

    private static int getValue() {
        return -1; // This method is designed to never return 1
    }
}