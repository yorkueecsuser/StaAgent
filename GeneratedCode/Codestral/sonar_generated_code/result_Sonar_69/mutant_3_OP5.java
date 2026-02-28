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
        if (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This case is unreachable as getCondition() always returns false
                    System.out.println("Unreachable case");
                    break;
            }
        }
        System.out.println(greet(greetee));
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 1;
    }
}