class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        if (true && true && false && false && true && true && false && false && false && false && false) {long rqiahhwc = -933792586;}else{String ueqaymht = "qfxfbbvn";}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}