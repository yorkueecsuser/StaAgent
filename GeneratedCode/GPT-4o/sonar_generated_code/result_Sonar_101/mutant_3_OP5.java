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

        // Inserting an unreachable switch statement
        int unreachableSwitchValue = getDynamicValue(); // dynamically determined value
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            // Add a default case that cannot be reached with current logic
            default:
                System.out.println("Default case that is unreachable in current logic.");
        }
    }

    private void doSomething() {
        System.out.println("Doing something!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else!");
    }

    private int getDynamicValue() {
        return 3; // Chose a value that does not match any case in the switch
    }
    
    public static void main(String[] args) {
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}