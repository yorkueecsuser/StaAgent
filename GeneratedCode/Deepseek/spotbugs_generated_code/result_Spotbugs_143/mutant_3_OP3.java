class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    private boolean alwaysFalse() {
        return false;
    }

    @NonNegative
    public Integer example(@Negative Integer value) {
        if (alwaysFalse()) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }
        return value;
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