class HelloWorld {
    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
        this.hello = hello; // Mutated code: duplicate the assignment statement

        return;
    }

    public String getHello() {
        return hello;
    }

    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));
    }
}