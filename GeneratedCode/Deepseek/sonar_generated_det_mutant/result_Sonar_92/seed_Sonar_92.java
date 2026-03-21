class Main {

    public static int showBug(int input) {
        return + + +input; // BUG: Unary prefix operators should not be repeated
    }

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}