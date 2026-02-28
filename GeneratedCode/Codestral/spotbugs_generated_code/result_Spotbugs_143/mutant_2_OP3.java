class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    private boolean isNegative(Integer value) {
        return value < 0;
    }

    @NonNegative
    public Integer example(@Negative Integer value) {
        if (isNegative(value)) { // insert an unreachable if branch
            return null; // this line will never be executed
        }
        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    }

    public Integer showBug(Integer value) {
        return example(value);
    }

    public static void main(String[] args) {
        TypeQualifierBug bug = new TypeQualifierBug();
        Integer buggyValue = bug.showBug(-1);
        System.out.println("Buggy value: " + buggyValue);
    }
}