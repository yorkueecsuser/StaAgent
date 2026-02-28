class BuggyCode {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String showBug() {
        try {
            // This line throws a NullPointerException if value is null
            return value.toString();
        } catch (NullPointerException e) {
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
            // value is guaranteed to be null here, and it is dereferenced in the next line

            // Mutant code: Unreachable switch statement
            switch (value.hashCode()) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should be unreachable");
                    break;
                default:
                    // Empty default case
                    break;
            }

            return value.substring(1);
        }
    }
}