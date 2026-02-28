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
        boolean unreachable = getCondition();
        if (unreachable) {
            // Unreachable code
            throw new UnsupportedOperationException("This code is unreachable");
        }
        System.out.println(greet(greetee));
    }

    private boolean getCondition() {
        return false;
    }
}