class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // BUG: JumbledIncrementer
        }
        System.out.println(sum);
    }
}

class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i]; // BUG: JumbledIncrementer
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i]; // BUG: JumbledIncrementer
            }
        }
        System.out.println(sum);
    }
}