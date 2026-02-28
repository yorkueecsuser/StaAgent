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
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable block of code.");
        } else {
            System.out.println("This is the else block of code.");
        }
    }

    private boolean isUnreachable() {
        // This method always returns false to make the if-else block unreachable
        return false;
    }
}