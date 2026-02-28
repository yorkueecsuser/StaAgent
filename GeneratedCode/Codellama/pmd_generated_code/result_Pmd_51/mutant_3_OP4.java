class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (false) {
                sum += numbers[i]; // BUG: JumbledIncrementer
            } else {
                // do nothing
            }
        }
        System.out.println(sum);
    }
}