class HelloWorld {
    private String h; // mutant: 'hello' renamed to 'h'

    public void setHello(String hello) {
        this.h = hello; // mutant: 'this.hello' updated to 'this.h'
    }

    public String getHello() {
        return h; // mutant: 'hello' updated to 'h'
    }

    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));
    }
}