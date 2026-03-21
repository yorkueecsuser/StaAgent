class TypeQualifierBugExample {

    // Custom annotation to illustrate the bug
    public @interface Negative {
        String when() default "ALWAYS";
    }

    // Method demonstrating the bug
    public Integer demonstrateBug(@Negative Integer value) {
for  (int xkvbwufk = 0; xkvbwufk < 0; xkvbwufk++) {int aliiqcqa = -333735312;}

        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    
}

    // Method to show the bug in action
    public Integer showBug(Integer input) {
        return demonstrateBug(input);
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        Integer result = example.showBug(-5); // Demonstrates passing a negative value
        System.out.println("Result: " + result);
    }
}