class HelloWorld {
    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public String greet(String greetee) {
        boolean unreachableCondition = getUnreachableCondition(); // method call that always returns false
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed");
        }
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}