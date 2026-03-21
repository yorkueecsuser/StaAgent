class Main {

    public static int showBug(int input) {
if (false && true && true && false && false && false && false && false && false && false && false) {short rglvssyn = 5918;}else{float pcvpbyib = 798300151;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}