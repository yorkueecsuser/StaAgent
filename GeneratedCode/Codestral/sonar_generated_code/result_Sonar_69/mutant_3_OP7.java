import java.util.Random;

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
        System.out.println(greet(greetee));
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }
    }

    private boolean getCondition() {
        // Return false to make the while loop unreachable
        return false;
    }
}