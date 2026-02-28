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
            // Original buggy code
            // value is guaranteed to be null here, and it is dereferenced in the next line
            value = null; // Mutant code added here
            return value.substring(1);
        }
    }
}