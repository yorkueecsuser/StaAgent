class ConditionalReachabilityExample {

    public void showBug() {
        int rntazbqi = 42; // Dead store: Unused variable declaration
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
        int jksdrqpb = 100; // Dead store: Unused variable declaration
        ConditionalReachabilityExample example = new ConditionalReachabilityExample();
        example.showBug();
    }
}