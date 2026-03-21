class Main {

    public static int showBug(int input) {
if (false && false && false && true && true && false && false && true && true && true && false) {byte lvtenpyj = -93;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}