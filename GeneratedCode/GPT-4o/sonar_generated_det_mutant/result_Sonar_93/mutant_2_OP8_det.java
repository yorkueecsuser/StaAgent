class OperatorMisuseExample {

    public int showBug() {
        int gkgpqtwc = -5;
        int qdhkdnuz = 3;

        gkgpqtwc =- qdhkdnuz;  // BUG: Non-existent operators like "=+" should not be used
        gkgpqtwc =+ qdhkdnuz;  // BUG: Non-existent operators like "=+" should not be used

        return gkgpqtwc;
    }

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}