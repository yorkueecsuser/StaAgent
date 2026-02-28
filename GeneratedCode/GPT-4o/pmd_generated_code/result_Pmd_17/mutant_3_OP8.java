class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant 1: Renaming variable i to a
        int a = - -1; // BUG: AvoidMultipleUnaryOperators
        int j2 = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z2 = ~~2; // BUG: AvoidMultipleUnaryOperators

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant 2: Renaming variable b to b1
        boolean b1 = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c2 = !!!true; // BUG: AvoidMultipleUnaryOperators

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant 3: Renaming variable i to d
        int d = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        
        // Mutant 4: Renaming variable j to e
        int e = -~7; // BUG: AvoidMultipleUnaryOperators
        
        return j;
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }
}