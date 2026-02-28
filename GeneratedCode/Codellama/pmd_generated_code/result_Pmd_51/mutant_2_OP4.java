class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // BUG: JumbledIncrementer

            // Unreachable if-else statement
            if (false) {
                System.out.println("This statement is unreachable");
            } else {
                System.out.println("This statement is reachable");
            }
        }
        System.out.println(sum);
    }
}