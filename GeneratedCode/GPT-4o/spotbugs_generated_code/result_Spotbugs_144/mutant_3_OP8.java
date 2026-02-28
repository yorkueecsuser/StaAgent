class TypeQualifierExample {

    public String requireNonNull(String x) {
        if (x == null) {
            throw new NullPointerException("Input cannot be null");
        }
        return x;
    }

    public String provideNullable() {
        return null;
    }

    public String showBug() {
        String nullableString = provideNullable();
        return requireNonNull(nullableString); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }

    public static void main(String[] args) {
        TypeQualifierExample y = new TypeQualifierExample();
        try {
            System.out.println(y.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException, as expected due to the bug.");
        }
    }
}