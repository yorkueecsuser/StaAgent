class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        boolean dytvhsyf = false;while (dytvhsyf && false && true && false && false && false && true && true && false && false && true && false) {int qildseix = -720851421;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}