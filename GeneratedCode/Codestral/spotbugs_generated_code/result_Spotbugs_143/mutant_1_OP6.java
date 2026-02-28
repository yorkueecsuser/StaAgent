class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    public Integer example(@Negative Integer value) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop to fulfill the mutation operator
            // The loop condition is always false to make it unreachable
        }
        return value; // The original bug is still present
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
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