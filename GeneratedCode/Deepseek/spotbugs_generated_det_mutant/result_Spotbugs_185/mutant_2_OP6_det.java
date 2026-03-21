class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        for  (int gxedpgly = 0; gxedpgly < 0; gxedpgly++) {long lkwxbnze = -54501700;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}