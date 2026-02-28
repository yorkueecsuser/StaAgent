class ConditionalReachabilityExample {

    public void showBug() {
        boolean a = false;
        if (a) { // BUG: Conditionally executed code should be reachable
            doSomething(); // This code is never executed
        }
        
        // Mutation: Inserting an unreachable while loop in a basic block
        boolean conditionWhile = getFalseCondition(); // This method always returns false
        while (conditionWhile) {
            System.out.println("This while loop is unreachable");
        }
        
        boolean b = true;
        if (!a || b) { // BUG: Conditionally executed code should be reachable
            doSomething(); 
        } else {
            doSomethingElse(); // This code is never executed
        }
    }

    private void doSomething() {
        System.out.println("Doing something!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else!");
    }
    
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}