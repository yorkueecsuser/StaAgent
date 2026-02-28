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
        
        // Mutation: Adding an unreachable if-else branch
        boolean unreachableCondition = isConditionFalse();
        if (unreachableCondition) {
            doSomethingElse();
        } else {
            // This branch will always be executed
            System.out.println("This branch is always executed because unreachableCondition is false.");
        }
    }

    private void doSomething() {
        System.out.println("Doing something!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else!");
    }
    
    private boolean isConditionFalse() {
        // This method returns false making the if-else branch unreachable
        return false;
    }
    
    public static void main(String[] args) {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}