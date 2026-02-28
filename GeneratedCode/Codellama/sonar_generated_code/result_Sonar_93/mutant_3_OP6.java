class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);

        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("i = " + i);
        }
    }
}