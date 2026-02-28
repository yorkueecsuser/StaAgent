class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    private boolean getUnreachableCondition() {
        return false;
    }

    @NonNegative
    public Integer example(@Negative Integer value) {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code"); // Unreachable if statement mutant
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