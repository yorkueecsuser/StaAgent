import java.util.Random;

class TypeQualifierBug {

    @interface NonNegative { }

    @interface Negative { }

    @NonNegative
    public Integer example(@Negative Integer value) {
        // Dead store mutant
        int unusedVariable = new Random().nextInt();

        return value; // Original bug still exists: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required.
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