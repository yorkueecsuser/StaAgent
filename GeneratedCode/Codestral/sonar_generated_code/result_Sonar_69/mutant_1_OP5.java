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
        boolean condition = getCondition(); // Added a method call to dynamically determine the condition
        if (condition) { // If condition is true, execute the switch statement
            int value = getValue(); // Added a method call to dynamically determine the switch value
            switch(value) {
                case 1:
                    // This case will never be reached as getValue() will never return 1
                    System.out.println("This is an unreachable case");
                    break;
                default:
                    System.out.println(greet(greetee));
                    break;
            }
        } else {
            System.out.println(greet(greetee));
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    private int getValue() {
        return 2; // Always returns a value other than 1 to make the case in the switch statement unreachable
    }
}