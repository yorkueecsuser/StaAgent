class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        if (true && true && true && true && false && false && false && true && false && false && false) {float qzkwksmb = 750860301;}else{long qxgrnzgb = 405807790;}
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}