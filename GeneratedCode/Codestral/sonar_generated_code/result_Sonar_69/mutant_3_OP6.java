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

    // Mutant: Adding an unreachable for loop
    public void showBug(String greetee) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
        System.out.println(greet(greetee));
    }

    // Method to return the condition for the loop
    private boolean getCondition() {
        return false;
    }
}