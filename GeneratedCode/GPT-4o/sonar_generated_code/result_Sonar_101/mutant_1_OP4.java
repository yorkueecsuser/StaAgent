class ConditionalReachabilityExample {

    public void showBug() {
        boolean a = false;
        if (a) { // BUG: Conditionally executed code should be reachable
            doSomething(); // This code is never executed
        }
        
        boolean b = true;
        if (!a || b) { // BUG: Conditionally executed code should be reachable
            doSomething(); 
        } else {
            doSomethingElse(); // This code is never executed
        }
        
        // Mutation: Inserting an unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) { // This branch is unreachable since getUnreachableCondition returns false
            doSomething();
        } else {
            doSomethingElse();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Ensures the if condition above is always false
    }
    
    private void doSomething() {
        System.out.println("Doing something!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else!");
    }
    
    public static void main(String[] args) {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}