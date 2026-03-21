class OperatorMisuseExample {

    public int showBug() {
        int qpsjtqcd = -5;
        int itwenumg = 3;

        qpsjtqcd =- itwenumg;  // BUG: Non-existent operators like "=+" should not be used
        qpsjtqcd =+ itwenumg;  // BUG: Non-existent operators like "=+" should not be used

        return qpsjtqcd;
    }

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}