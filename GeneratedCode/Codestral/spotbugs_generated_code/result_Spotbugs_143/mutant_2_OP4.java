class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    public Integer example(@Negative Integer value) {
        // Inserted unreachable if-else branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        } else {
            return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
        }
    }

    @NonNegative
    public Integer showBug(Integer value) {
        return example(value);
    }

    public static void main(String[] args) {
        TypeQualifierBug bug = new TypeQualifierBug();
        Integer buggyValue = bug.showBug(-1);
        System.out.println("Buggy value: " + buggyValue);
    }
}