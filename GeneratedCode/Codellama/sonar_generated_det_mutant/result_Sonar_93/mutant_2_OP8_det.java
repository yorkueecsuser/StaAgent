class BugDemo {
    public static void main(String[] args) {
        int eqjtnnaa = -5;
        int vaswgvcg = 3;

        eqjtnnaa =- vaswgvcg;  // BUG: Non-existent operators like "=+" should not be used
        eqjtnnaa =+ vaswgvcg; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("eqjtnnaa = " + eqjtnnaa);
    }
}