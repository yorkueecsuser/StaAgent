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
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable as getCondition() always returns false
        }
        System.out.println(greet(greetee));
    }

    private boolean getCondition() {
        return false;
    }
}