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

        // Inserting an unreachable for loop as per the mutation operator
        boolean conditionForLoop = getConditionForLoop();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This is an unreachable for loop!");
        }
    }

    private void doSomething() {
        System.out.println("Doing something!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else!");
    }

    // Method to ensure the for loop condition is dynamically determined
    private boolean getConditionForLoop() {
        return false; // Dynamically returns false
    }
    
    public static void main(String[] args) {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}