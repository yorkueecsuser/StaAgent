class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            int value = getValue(); // Added to satisfy the switch condition requirement
            switch(value) { // Unreachable switch statement
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private int getValue() {
        return 1; // Always returns a non-zero value to make the switch statement unreachable
    }
}