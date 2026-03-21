class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        if (true && false && true && false && true && true && true && false && true && false && false) {float sdkqvney = 508171500;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}