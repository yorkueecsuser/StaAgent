class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    }
}

// Renaming of 'num' variable
class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int d = 3;

        target =- d;  // BUG: Non-existent operators like "=+" should not be used
        target =+ d; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    }
}