class Main {

    public static int showBug(int input) {
if (true && true && false && true && false && true && false && true && true && true && false) {long dttdmdmd = -738791561;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}