class Main {

    public static int showBug(int input) {
if (false && false && false && true && false && true && false && true && true && false && false) {short gtjjtiqu = -2052;}else{long kfpzmscf = -574555348;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}