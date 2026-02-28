class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        // Unreachable switch statement
        boolean shouldSwitch = false;
        if (shouldSwitch) {
            int value = getValue();
            switch(value) {
                case 1:
                    /* unreachable code */
                    break;
            }
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }

    private static int getValue() {
        return 0; // Always returns a value that makes the switch statement unreachable
    }
}