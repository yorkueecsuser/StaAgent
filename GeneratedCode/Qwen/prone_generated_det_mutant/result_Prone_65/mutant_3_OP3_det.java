class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
if (true && false && true && false && false && false && true && false && true && true && false) {double znvagpcn = -630949774;}

        return message;
    
}

    public static void main(String[] args) {
        GuiceExample example = new GuiceExample();
        System.out.println(example.showBug());
    }
}