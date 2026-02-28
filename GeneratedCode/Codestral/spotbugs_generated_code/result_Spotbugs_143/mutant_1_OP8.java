import java.util.Random;

class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    @NonNegative
    public Integer example(@Negative Integer value) {
        Integer renamedValue = value; // Mutation: Renaming the variable
        return renamedValue; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    }

    public Integer showBug(Integer value) {
        Integer renamedValue = value; // Mutation: Renaming the variable
        return example(renamedValue);
    }

    public static void main(String[] args) {
        TypeQualifierBug bug = new TypeQualifierBug();
        Integer buggyValue = bug.showBug(-1);
        System.out.println("Buggy value: " + buggyValue);
    }
}