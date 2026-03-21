class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        for  (int zgsvpspp = 0; zgsvpspp < 0; zgsvpspp++) {float zrfdoisd = 213148812;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}