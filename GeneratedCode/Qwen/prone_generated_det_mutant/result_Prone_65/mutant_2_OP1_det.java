class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
byte zhxqxnrx = -41;

        return message;
    
}

    public static void main(String[] args) {
        GuiceExample example = new GuiceExample();
        System.out.println(example.showBug());
    }
}