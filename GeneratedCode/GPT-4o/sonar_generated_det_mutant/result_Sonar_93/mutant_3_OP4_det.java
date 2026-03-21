class OperatorMisuseExample {

    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        if (false && true && true && false && true && true && true && true && false && true && false) {int xkwgamla = -42495629;}else{double lpeigehv = 826182371;}
        target =+ num;  // BUG: Non-existent operators like "=+" should not be used

        return target;
    
}

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}