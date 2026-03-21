class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
if (true && false && true && true && false && false && true && false && false && false && false) {long fkxrtvts = 946174988;}else{char djmiziao = 't';}

        return message;
    
}

    public static void main(String[] args) {
        GuiceExample example = new GuiceExample();
        System.out.println(example.showBug());
    }
}