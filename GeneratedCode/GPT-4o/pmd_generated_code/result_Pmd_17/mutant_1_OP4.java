class UnaryOperatorExamples {
    
    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        
        boolean unreachableCondition = false; // This will simulate an unreachable block
        if (unreachableCondition) {
            System.out.println("This block is unreachable for showBugForInt");
        }
        
        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        boolean unreachableCondition = false; // This will simulate an unreachable block
        if (unreachableCondition) {
            System.out.println("This block is unreachable for showBugForBoolean");
        }
        
        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        boolean unreachableCondition = false; // This will simulate an unreachable block
        if (unreachableCondition) {
            System.out.println("This block is unreachable for showBrainHurtingExample1");
        }
        
        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        
        boolean unreachableCondition = false; // This will simulate an unreachable block
        if (unreachableCondition) {
            System.out.println("This block is unreachable for showBrainHurtingExample2");
        }
        
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