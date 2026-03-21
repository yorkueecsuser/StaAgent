class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        for  (int duetpcpj = 0; duetpcpj < 0; duetpcpj++) {boolean xlrarrgg = true;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}