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

// Mutant: Renaming mutation operator applied
class ConditionalReachabilityExampleMutant1 {

    public void showBug() {
        boolean x = false; // Renamed variable a to x
        if (x) { // BUG: Conditionally executed code should be reachable
            doSomething(); // This code is never executed
        }
        
        boolean b = true;
        if (!x || b) { // Updated to reflect the renamed variable
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
    
    public static void main(String[] args) {
        ConditionalReachabilityExampleMutant1 example = new ConditionalReachabilityExampleMutant1();
        example.showBug();
    }
}