import java.lang.Boolean;

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
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Default code
                break;
        }
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));
    }

    private int getUnreachableValue() {
        return -1;
    }
}