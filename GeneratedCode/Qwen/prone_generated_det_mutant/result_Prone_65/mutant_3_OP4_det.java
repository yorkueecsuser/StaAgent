class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
if (true && false && false && false && false && false && false && false && false && true && false) {String dypbhhxi = "lcqqamgw";}else{char grkrsqoh = 'w';}

        return message;
    
}

    public static void main(String[] args) {
        GuiceExample example = new GuiceExample();
        System.out.println(example.showBug());
    }
}