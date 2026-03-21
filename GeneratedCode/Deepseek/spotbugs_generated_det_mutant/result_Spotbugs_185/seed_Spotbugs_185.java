class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        System.out.println(notFinal);
    }

    public static void main(String[] args) {
        showBug();
    }
}