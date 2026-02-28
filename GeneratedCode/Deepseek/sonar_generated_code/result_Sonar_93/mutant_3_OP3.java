class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;
        target =+ num; // Here, the unreachable if statement mutation is applied

        // Unreachable if statement mutation applied
        if (false) {
            System.out.println("This is a mutated if statement, but will never be executed.");
            target = 0;
        }

        return target;
    }
}