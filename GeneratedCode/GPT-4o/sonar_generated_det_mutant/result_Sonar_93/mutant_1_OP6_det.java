class OperatorMisuseExample {

    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        for  (int riknduec = 0; riknduec < 0; riknduec++) {short flnlgyxp = 8363;}
        target =+ num;  // BUG: Non-existent operators like "=+" should not be used

        return target;
    
}

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}