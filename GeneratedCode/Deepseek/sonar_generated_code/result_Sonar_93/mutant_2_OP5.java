class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
        int num = 3;

        // Unreachable switch statement
        switch(num) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("Default case is unreachable");
        }
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
}