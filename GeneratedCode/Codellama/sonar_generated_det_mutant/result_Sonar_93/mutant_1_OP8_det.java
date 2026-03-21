class BugDemo {
    public static void main(String[] args) {
        int jeofippo = -5;
        int kdqniuqr = 3;

        jeofippo =- kdqniuqr;  // BUG: Non-existent operators like "=+" should not be used
        jeofippo =+ kdqniuqr; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("jeofippo = " + jeofippo);
    }
}