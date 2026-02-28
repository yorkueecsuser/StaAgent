class TypeQualifierBugDemo {

    private String x() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String value = x();
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    }

    private void useNonNullString(String y) {
        // This method requires a non-null string
        System.out.println(y.length());
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo z = new TypeQualifierBugDemo();
        z.showBug();
    }
}