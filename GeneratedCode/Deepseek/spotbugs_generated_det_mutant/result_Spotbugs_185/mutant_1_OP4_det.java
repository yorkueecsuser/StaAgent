class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        if (true && true && false && false && false && true && true && true && true && false && false) {float bphaqlxx = 240748335;}else{String bbbjvfnq = "brcvyrvs";}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}