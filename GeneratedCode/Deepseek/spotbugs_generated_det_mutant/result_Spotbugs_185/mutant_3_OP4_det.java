class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        if (false && false && false && true && true && false && true && false && true && false && false) {float zfmjnwqi = -975067750;}else{short omojsgoz = -9212;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}