class OperatorMisuseExample {

    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        if (false && true && true && false && false && true && true && true && false && false && false) {char zfdntuol = 's';}else{long yovfpndt = 293286914;}
        target =+ num;  // BUG: Non-existent operators like "=+" should not be used

        return target;
    
}

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}