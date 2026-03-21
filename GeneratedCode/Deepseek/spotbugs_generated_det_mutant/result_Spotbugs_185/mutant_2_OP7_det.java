class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        boolean bktlilmc = false;while (bktlilmc && false && true && true && false && true && true && false && false && false && true && false) {char kjyizzqo = 'e';}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}