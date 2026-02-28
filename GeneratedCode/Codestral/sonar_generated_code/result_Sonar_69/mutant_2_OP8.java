// Noncompliant; this doesn't get cleaned up
// BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
class HelloWorld {
    private String h; // Mutated variable name

    public void setHello(String hello) {
        this.h = hello; // Use of mutated variable name
    }

    public String getHello() {
        return h; // Use of mutated variable name
    }

    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));
    }
}