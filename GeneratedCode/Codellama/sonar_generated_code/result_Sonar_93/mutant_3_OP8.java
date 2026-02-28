class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    }
}

// Renaming mutant for variable "target"
class BugDemo {
    public static void main(String[] args) {
        int a = -5;
        int num = 3;

        a =- num;  // BUG: Non-existent operators like "=+" should not be used
        a =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("a = " + a);
    }
}

// Renaming mutant for variable "num"
class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int b = 3;

        target =- b;  // BUG: Non-existent operators like "=+" should not be used
        target =+ b; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    }
}