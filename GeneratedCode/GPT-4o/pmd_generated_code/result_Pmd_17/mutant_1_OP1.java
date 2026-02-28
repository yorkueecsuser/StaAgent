class UnaryOperatorExamples {

    public int showBugForInt() {
        int crashmww = 10; // Dead Store
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean qweasnfg = false; // Dead Store
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        return b && c;
    }

    public int showBrainHurtingExample1() {
        int zqxybcde = 3; // Dead Store
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        return i;
    }

    public int showBrainHurtingExample2() {
        int mynameis = 22; // Dead Store
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