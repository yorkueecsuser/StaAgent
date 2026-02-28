class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    public boolean getCondition() {
        // This method can be modified to return a dynamic condition
        return false;
    }

    @NonNegative
    public Integer example(@Negative Integer value) {
        // Introducing unreachable if-else statement
        if (getCondition()) {
            // This branch will never be executed
            throw new RuntimeException("Unreachable code");
        } else {
            // This is the original bug-inducing line
            return value;
        }
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