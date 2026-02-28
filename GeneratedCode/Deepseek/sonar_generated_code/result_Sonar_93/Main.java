class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }

        return target;
    }
}