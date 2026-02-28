class HelloWorld {
    private String hello;
    private String deadStoreVariable; // Dead store mutant added

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
        deadStoreVariable = "UnusedValue"; // Dead store mutant: variable is assigned but never used
        System.out.println(greet(greetee));
    }
}