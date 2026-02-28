class ConditionalReachabilityExample {

    public void showBug() {
        boolean a = false;
        a = false; // Duplication of the assignment statement
        if (a) { // BUG: Conditionally executed code should be reachable
            doSomething(); // This code is never executed
        }
        
        boolean b = true;
        b = true; // Duplication of the assignment statement
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