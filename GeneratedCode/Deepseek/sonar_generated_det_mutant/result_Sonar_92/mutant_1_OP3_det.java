class Main {

    public static int showBug(int input) {
if (true && true && false && false && true && true && true && true && false && false && false) {short vmiangbt = 2839;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}