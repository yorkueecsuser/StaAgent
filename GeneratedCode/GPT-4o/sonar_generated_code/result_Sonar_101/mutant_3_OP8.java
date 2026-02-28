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
    }
    
    // Mutant code: Renaming variable 'b' to 'x'
    public void showBugMutant1() {
        boolean a = false;
        if (a) {
            doSomething();
        }
        
        boolean x = true; // Renamed variable 'b' to 'x'
        if (!a || x) {
            doSomething(); 
        } else {
            doSomethingElse();
        }
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
        example.showBugMutant1(); // Execute the mutant method
    }
}