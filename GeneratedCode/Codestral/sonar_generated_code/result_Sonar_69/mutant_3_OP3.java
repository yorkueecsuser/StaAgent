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
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block will never be executed
            System.out.println("Unreachable statement");
        }
        System.out.println(greet(greetee));
    }
}