class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String v = maybeNullString(); // Renamed "value" to "v"
        useNonNullString(v); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    }

    private void useNonNullString(String s) { // Renamed "str" to "s"
        // This method requires a non-null string
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo d = new TypeQualifierBugDemo(); // Renamed "demo" to "d"
        d.showBug();
    }
}