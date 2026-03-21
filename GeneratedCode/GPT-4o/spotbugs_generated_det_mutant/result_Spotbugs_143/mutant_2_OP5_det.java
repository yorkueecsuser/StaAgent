class TypeQualifierBugExample {

    // Custom annotation to illustrate the bug
    public @interface Negative {
        String when() default "ALWAYS";
    }

    // Method demonstrating the bug
    public Integer demonstrateBug(@Negative Integer value) {
int rbdbxfuj = 0;switch  (rbdbxfuj) {case 1:short crnehveq = 8413;break;default:String kjfebmsl = "dmwivcqh";break;}

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