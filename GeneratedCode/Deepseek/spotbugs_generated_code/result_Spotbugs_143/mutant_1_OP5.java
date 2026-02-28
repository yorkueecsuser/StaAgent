class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    private boolean getCondition() {
        return false;
    }

    @NonNegative
    public Integer example(@Negative Integer value) {
        // Mutant code
        int unreachableValue = 0;
        if (getCondition()) {
            unreachableValue = 1;
        }
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("This line should never be printed");
                break;
        }

        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
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