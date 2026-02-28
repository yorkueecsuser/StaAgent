class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    @NonNegative
    public Integer example(@Negative Integer value) {
        return value; // Original bug
        return value; // Mutant: duplicate the buggy return statement
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