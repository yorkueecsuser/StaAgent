class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant: Renaming a variable
        int a = - -1;
        int b = + - +1;
        int c = ~~2;
        
        return i + j + z; // Returning original variables
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant: Renaming a variable
        boolean x = !!true;
        boolean y = !!!true;
        
        return b && c; // Returning original variables
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant: Renaming a variable
        int m = ~-2;
        
        return i; // Returning original variable
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant: Renaming a variable
        int n = -~7;
        
        return j; // Returning original variable
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }
}