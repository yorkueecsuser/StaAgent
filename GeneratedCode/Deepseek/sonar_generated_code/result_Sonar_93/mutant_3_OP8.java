class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public static int showMutant() {
        int x = -5; // Mutated variable name
        int y = 3; // Mutated variable name

        x =- y; // Mutated operator
        x =+ y; // Mutated operator
        return x;
    }
}