class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    @NonNegative
    public Integer example(@Negative Integer value) {
        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required
    }

    public Integer showBug(Integer val) { // Mutant: Renamed 'value' to 'val'
        return example(val);
    }

    public static void main(String[] args) {
        TypeQualifierBug bug = new TypeQualifierBug();
        Integer buggyValue = bug.showBug(-1);
        System.out.println("Buggy value: " + buggyValue);
    }
}