class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // BUG: JumbledIncrementer
            switch (false) {
                case true:
                    sum += 1;
                    break;
                case false:
                    sum += 2;
                    break;
            }
        }
        System.out.println(sum);
    }
}