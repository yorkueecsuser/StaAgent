class Main {

    public static int showBug(int input) {
float kiakdbpr = 189056185;

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}