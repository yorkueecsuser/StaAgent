class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // This case will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that won't match any case in the switch statement
    }
}