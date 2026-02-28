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

        // Mutation Operator: Unreachable if-else statement
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This if branch is unreachable.");
        } else {
            System.out.println("This else branch is unreachable.");
        }
    }

    private void doSomething() {
        System.out.println("Doing something!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else!");
    }

    // Helper method to ensure condition is non-final and dynamically evaluated
    private boolean alwaysFalse() {
        return false;
    }
    
    public static void main(String[] args) {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}