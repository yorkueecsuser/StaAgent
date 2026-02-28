class UnaryOperatorExamples {

    public int showBugForInt() {
        int unusedVar1 = 12345678; // Dead Store mutation: Unused variable
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean unusedVar2 = false; // Dead Store mutation: Unused variable
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        return b && c;
    }

    public int showBrainHurtingExample1() {
        int unusedVar3 = 98765432; // Dead Store mutation: Unused variable
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        return i;
    }

    public int showBrainHurtingExample2() {
        int unusedVar4 = 87654321; // Dead Store mutation: Unused variable
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
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