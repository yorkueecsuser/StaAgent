class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
        return message;
    }
public static void main(String [] args){
    GuiceExample example = new GuiceExample();
    example = new GuiceExample();
    System.out.println(example.showBug());
}
}