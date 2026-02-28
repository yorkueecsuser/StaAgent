// Noncompliant; this doesn't get cleaned up
// BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
class HelloWorld {
    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));

        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch will never execute
            int x = 10;
            x += 5;
        } else {
            // This is the unreachable branch
            System.out.println("Unreachable code executed!");
        }
    }

    // Method to return a condition that is always false for mutation
    private boolean getCondition() {
        return false;
    }
}