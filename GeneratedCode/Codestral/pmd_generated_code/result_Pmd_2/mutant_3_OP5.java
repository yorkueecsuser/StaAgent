class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        // Insert the unreachable switch statement
        int value = getFalseValue();
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("This is an unreachable switch statement");
                break;
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    // Method to return a value that will always make the switch statement unreachable
    private static int getFalseValue() {
        return -1;
    }
}