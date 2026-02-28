class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;
        target =+ num;

        // Mutation: Adding an unreachable if-else statement
        if (false) {
            target = 0;
        } else {
            target = 100;
        }

        return target;
    }
}