class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // BUG: JumbledIncrementer
        }
        System.out.println(sum);

        // Insert Unreachable for loop mutant
        for (int i = 0; false; i++) {
            // This code is unreachable
            sum++;
        }
    }
}