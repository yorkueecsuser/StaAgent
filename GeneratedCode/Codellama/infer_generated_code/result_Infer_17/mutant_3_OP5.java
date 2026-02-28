// BUG: INTEGER_OVERFLOW_L2
class IntegerOverL2 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}

// Unreachable switch statement mutant
class IntegerOverL2 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    public int showBugMutant() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        int result;

        switch (false) {
            case 1:
                result = arr[Math.abs(y % 10)];
                break;
            default:
                result = arr[Math.abs(y % 10)];
                break;
        }

        return result;
    }
}