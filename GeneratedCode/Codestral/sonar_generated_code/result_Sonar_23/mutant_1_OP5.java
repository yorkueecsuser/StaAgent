class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            // Add unreachable switch statement
            boolean condition = false;
            int value = getValue();
            switch (condition? value : -1) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed");
                    break;
                default:
                    // Default case to avoid compiler errors
                    break;
            }

            return (Integer) obj; // BUG: Cast operations should not trigger a ClassCastException
        }
        return obj;
    }

    private int getValue() {
        return 0;
    }
}